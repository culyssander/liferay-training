package com.liferay.training.gradebook.service.rest.application;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.jsonwebservice.JSONWebServiceMode;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyService;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.training.gradebook.model.Assignment;
import com.liferay.training.gradebook.service.AssignmentLocalService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

@Component(
		property = {
			JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/assignments",
			JaxrsWhiteboardConstants.JAX_RS_NAME + "=Assignment.Rest",
			"liferay.auth.verifier=false",
			"liferay.oauth2=false"
		},
		service = Application.class
	)
public class AssignmentRestApplication extends Application {
	
	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	
	
	@GET
	@Path("/assignment")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String getAssignments() {
		
		Company company;
		List<Assignment> assignments = new ArrayList<Assignment>();
		
		try {
			
			company = _companyService.getCompanyById(PortalUtil.getDefaultCompanyId());
			
			List<Group> groups = _groupLocalService.getGroups(company.getCompanyId(), 0, true);
			
			for(Group group: groups) {
				assignments.addAll(_assignmentLocalService.getAssignmentsByGroupId(group.getGroupId()));
			}
			
			return JSONFactoryUtil.serialize(assignments);
		} catch (Exception e) {
			return "";
		}
		
	}
	
	@GET
	@Path("/assignment/{assignmentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAssignment(@PathParam("assignmentId") long assignmentId) {
		try {
			
			Assignment assignment = _assignmentLocalService.getAssignment(assignmentId);
			
//			return JSONFactoryUtil.serialize(assignment);
			return Response.ok(assignment).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	
	@DELETE
	@Path("/assignment/{assignmentId}")
	@Produces(MediaType.APPLICATION_JSON)
//	@JSONWebService(
//		mode = JSONWebServiceMode.IGNORE,
//		method = "DELETE"
//	)
	public Response deleteAssignmentById(@PathParam("assignmentId") long assignmentId) {
		try {
			
			_assignmentLocalService.deleteAssignment(assignmentId);
			
			return Response.status(Response.Status.NO_CONTENT).build();
			
			
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	
	@Reference
	private CompanyService _companyService;
	
	@Reference
	private GroupLocalService _groupLocalService;
	
	@Reference
	private AssignmentLocalService _assignmentLocalService;

}

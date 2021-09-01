package com.liferay.training.portlet.employeemanager.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.training.portlet.employeemanager.constants.PortletMVCEmployeePortletKeys;
import com.liferay.training.service.employeemanager.EmployeeRepo;
import com.liferay.training.model.employeemanager.Employee;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + PortletMVCEmployeePortletKeys.PORTLETMVCEMPLOYEE,
		"mvc.command.name=handleForm"
	},
	service = MVCActionCommand.class
)
public class HandleFormMVCActionCommand extends BaseMVCActionCommand {
	
	@Reference
	private EmployeeRepo repo;
	
	public HandleFormMVCActionCommand() {
		
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		_handleActionCommand(actionRequest);
	}
	
	private void _handleActionCommand(ActionRequest actionRequest) {
		String name = actionRequest.getParameter("name");
		String email = actionRequest.getParameter("email");
		String jobTitle = actionRequest.getParameter("jobTitle");
		
		Employee employee = new Employee(name, email, jobTitle);
		
		employee = repo.save(employee);
	}

}

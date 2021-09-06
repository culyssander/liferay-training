/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.gradebook.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.gradebook.model.Submission;
import com.liferay.training.gradebook.service.base.SubmissionServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;


/**
 * The implementation of the submission remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.gradebook.service.SubmissionService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gradebook",
		"json.web.service.context.path=Submission"
	},
	service = AopService.class
)
public class SubmissionServiceImpl extends SubmissionServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.training.gradebook.service.SubmissionServiceUtil</code> to access the submission remote service.
	 */
	
	public Submission addSubmission(long assignmentId, long studentId, String submissionText,
			ServiceContext serviceContext) throws PortalException {

		// [Permission checks will be added here later]

		return submissionLocalService.addSubmission(assignmentId, studentId, submissionText, serviceContext);
	}

	public Submission deleteSubmission(long submissionId) throws PortalException {

		// [Permission checks will be added here later]

		return submissionLocalService.deleteSubmission(submissionId);
	}

	public List<Submission> getSubmissionsByAssignment(long groupId, long assignmentId) {

		// [Permission checks will be added here later]

		return submissionPersistence.findByG_A(groupId, assignmentId);
	}

	public List<Submission> getSubmissionsByAssignment(long groupId, long assignmentId, int start, int end) {

		// [Permission checks will be added here later]

		return submissionPersistence.findByG_A(groupId, assignmentId, start, end);
	}

	public int getSubmissionsCountByAssignment(long groupId, long assignmentId) {

		// [Permission checks will be added here later]

		return submissionPersistence.countByG_A(groupId, assignmentId);
	}

	public Submission gradeAndCommentSubmission(long submissionId, int grade, String comment) throws PortalException {

		// [Permission checks will be added here later]

		return submissionLocalService.gradeAndCommentSubmission(submissionId, grade, comment);
	}
	
	public Submission gradeSubmission(long submissionId, int grade) throws PortalException {

		// [Permission checks will be added here later]

		return submissionLocalService.gradeSubmission(submissionId, grade);
	}

	public Submission updateSubmission(long submissionId, String submissionText, ServiceContext serviceContext)
			throws PortalException {

		// [Permission checks will be added here later]

		return submissionLocalService.updateSubmission(submissionId, submissionText, serviceContext);
	}
}
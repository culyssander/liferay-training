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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.gradebook.model.Assignment;
import com.liferay.training.gradebook.model.Submission;
import com.liferay.training.gradebook.service.base.SubmissionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the submission local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.training.gradebook.service.SubmissionLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionLocalServiceBaseImpl
 * @see com.liferay.training.gradebook.service.SubmissionLocalServiceUtil
 */
public class SubmissionLocalServiceImpl extends SubmissionLocalServiceBaseImpl {

	@Override
	public Submission addSubmission(long assignmentId, long studentId, String submissionText,
			ServiceContext serviceContext) throws PortalException {

		//
		// ( 1 ) - Get Assignment.
		//
		// Hint: use assignmentPersistence findBy finder methor or assignmentLocalService
		
		Assignment assignment = assignmentLocalService.getAssignment(assignmentId);
		
		//
		// ( 2 ) - Get user.
		//
		// Even though we will be not using the user object in this method, fetching it validates 
		// its existence.
		//
		// Hint: get the userId from the ServiceContext
		// then use userPersistence findBy finder method or userLocalService

		long userId = serviceContext.getUserId();

		User user = userLocalService.getUserById(userId);

		//
		// ( 3 ) - Get student user (studentId).
		//
 		// Even though we will be not using the user object in this method, fetching it validates 
		// its existence.
		//
		// Hint: use userPersistence or userLocalService

		User studentUser = userLocalService.getUser(studentId);
		
		//
		// ( 4 ) - Generate submission id
		//
		// Hint: use counterLocalService's class name tied signature

		long submissionId = counterLocalService.increment(Submission.class.getName());

		//
		// ( 5 ) - Create Submission
		//
		// Hint: use submissionLocalService.createSubmission()

		Submission submission = submissionLocalService.createSubmission(submissionId);

		// Populate submission fields

		submission.setSubmissionId(submissionId);
		submission.setAssignmentId(assignmentId);
		submission.setCompanyId(assignment.getCompanyId());
		submission.setGroupId(assignment.getGroupId());
		submission.setCreateDate(new Date());
		submission.setModifiedDate(new Date());
		
		submission.setUserId(userId);
		submission.setGrade(-1);
		submission.setStudentId(studentId);
		submission.setSubmisionText(submissionText);
		submission.setSubmitDate(new Date());
		
		//
		// ( 6 ) - Persist the entity.
		//
		// Hint: use super.addSubmission(submission).
		
		submission = super.addSubmission(submission);

		//
		// ( 7 ) - Return the updated Submission.
		//
		
		return submission;
	}

	public List<Submission> getSubmissionsByAssignment(long groupId, long assignmentId) {

		//
		// ( 8 ) - Get submissions by groupId.
		//
		// Hint: Use submissionPersistence findBy finder methods.

		return submissionPersistence.findByG_A(groupId, assignmentId);
	}

	public List<Submission> getSubmissionsByAssignment(long groupId, long assignmentId, int start, int end) {

		//
		// ( 9 ) - Get submissions by groupId and assignmentId.
		//
		// Hint: Use submissionPersistence findBy finder methods.
		
		return submissionPersistence.findByG_A(groupId, assignmentId, start, end);
	}

	public int getSubmissionsCountByAssignment(long groupId, long assignmentId) {

		//
		// ( 10 ) - Get count by groupId and assignmentId.
		//
		// Hint: Use submissionPersistence finder methods.

		return submissionPersistence.countByG_A(groupId, assignmentId);
	}

	public Submission gradeAndCommentSubmission(long submissionId, int grade, String comment) throws PortalException {

		//
		// ( 11 ) - Get Submission.
		//
		// Hint: use this.getSubmission()
		
		Submission submission = this.getSubmission(submissionId);	
		
		//
		// ( 12 ) - Update following fields: grade, comment, modifiedDate.
		//
		submission.setGrade(grade);
		submission.setComment(comment);
		submission.setModifiedDate(new Date());
		
		//
		// ( 13 ) - Return updated submission.
		//
		// Hint: use super.updateSubmission()

		return super.updateSubmission(submission);
	}

	public Submission gradeSubmission(long submissionId, int grade) throws PortalException {

		//
		// ( 14 ) - Get Submission.
		//
		// Hint: use this.getSubmission()

		Submission submission = this.getSubmission(submissionId);
		
		//
		// ( 15 ) - Update following fields: grade, modifiedDate.
		//
		// Hint: Use submission setters
		submission.setGrade(grade);
		submission.setModifiedDate(new Date());
		
		//
		// ( 16 ) - Return updated submission.
		//
		// Hint: use super.updateSubmission()

		return super.updateSubmission(submission);
	}

	@Override
	public Submission updateSubmission(long submissionId, String submissionText, ServiceContext serviceContext)
			throws PortalException {
		
		//
		// ( 17 ) - Get Submission.
		//
		// Hint: use this.getSubmission()
		
		Submission submission = this.getSubmission(submissionId);

		//	
		// ( 18 ) - Update following fields: submissionText, submitDate, modifiedDate.
		//
		// Hint: use submission setters, set submitDate and modifiedDate to current date
		
		submission.setSubmisionText(submissionText);
		submission.setSubmitDate(new Date());
		submission.setModifiedDate(new Date());
		
		
		//
		// ( 19 ) - Persist the entity.
		//
		// Hint: use super.updateSubmission(submission).
		
		submission = super.updateSubmission(submission);

		//
		// ( 20 ) - Return updated submission.
		//
		
		return submission;
	}
}
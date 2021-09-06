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

package com.liferay.training.gradebook.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Submission}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Submission
 * @generated
 */
public class SubmissionWrapper
	extends BaseModelWrapper<Submission>
	implements ModelWrapper<Submission>, Submission {

	public SubmissionWrapper(Submission submission) {
		super(submission);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("submissionId", getSubmissionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("studentId", getStudentId());
		attributes.put("submitDate", getSubmitDate());
		attributes.put("submissionText", getSubmissionText());
		attributes.put("comment", getComment());
		attributes.put("grade", getGrade());
		attributes.put("assignmentId", getAssignmentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long submissionId = (Long)attributes.get("submissionId");

		if (submissionId != null) {
			setSubmissionId(submissionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		Date submitDate = (Date)attributes.get("submitDate");

		if (submitDate != null) {
			setSubmitDate(submitDate);
		}

		String submissionText = (String)attributes.get("submissionText");

		if (submissionText != null) {
			setSubmissionText(submissionText);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		Integer grade = (Integer)attributes.get("grade");

		if (grade != null) {
			setGrade(grade);
		}

		Long assignmentId = (Long)attributes.get("assignmentId");

		if (assignmentId != null) {
			setAssignmentId(assignmentId);
		}
	}

	/**
	 * Returns the assignment ID of this submission.
	 *
	 * @return the assignment ID of this submission
	 */
	@Override
	public long getAssignmentId() {
		return model.getAssignmentId();
	}

	/**
	 * Returns the comment of this submission.
	 *
	 * @return the comment of this submission
	 */
	@Override
	public String getComment() {
		return model.getComment();
	}

	/**
	 * Returns the company ID of this submission.
	 *
	 * @return the company ID of this submission
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this submission.
	 *
	 * @return the create date of this submission
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the grade of this submission.
	 *
	 * @return the grade of this submission
	 */
	@Override
	public int getGrade() {
		return model.getGrade();
	}

	/**
	 * Returns the group ID of this submission.
	 *
	 * @return the group ID of this submission
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this submission.
	 *
	 * @return the modified date of this submission
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this submission.
	 *
	 * @return the primary key of this submission
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student ID of this submission.
	 *
	 * @return the student ID of this submission
	 */
	@Override
	public long getStudentId() {
		return model.getStudentId();
	}

	/**
	 * Returns the submission ID of this submission.
	 *
	 * @return the submission ID of this submission
	 */
	@Override
	public long getSubmissionId() {
		return model.getSubmissionId();
	}

	/**
	 * Returns the submission text of this submission.
	 *
	 * @return the submission text of this submission
	 */
	@Override
	public String getSubmissionText() {
		return model.getSubmissionText();
	}

	/**
	 * Returns the submit date of this submission.
	 *
	 * @return the submit date of this submission
	 */
	@Override
	public Date getSubmitDate() {
		return model.getSubmitDate();
	}

	/**
	 * Returns the user ID of this submission.
	 *
	 * @return the user ID of this submission
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this submission.
	 *
	 * @return the user name of this submission
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this submission.
	 *
	 * @return the user uuid of this submission
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this submission.
	 *
	 * @return the uuid of this submission
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the assignment ID of this submission.
	 *
	 * @param assignmentId the assignment ID of this submission
	 */
	@Override
	public void setAssignmentId(long assignmentId) {
		model.setAssignmentId(assignmentId);
	}

	/**
	 * Sets the comment of this submission.
	 *
	 * @param comment the comment of this submission
	 */
	@Override
	public void setComment(String comment) {
		model.setComment(comment);
	}

	/**
	 * Sets the company ID of this submission.
	 *
	 * @param companyId the company ID of this submission
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this submission.
	 *
	 * @param createDate the create date of this submission
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the grade of this submission.
	 *
	 * @param grade the grade of this submission
	 */
	@Override
	public void setGrade(int grade) {
		model.setGrade(grade);
	}

	/**
	 * Sets the group ID of this submission.
	 *
	 * @param groupId the group ID of this submission
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this submission.
	 *
	 * @param modifiedDate the modified date of this submission
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this submission.
	 *
	 * @param primaryKey the primary key of this submission
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student ID of this submission.
	 *
	 * @param studentId the student ID of this submission
	 */
	@Override
	public void setStudentId(long studentId) {
		model.setStudentId(studentId);
	}

	/**
	 * Sets the submission ID of this submission.
	 *
	 * @param submissionId the submission ID of this submission
	 */
	@Override
	public void setSubmissionId(long submissionId) {
		model.setSubmissionId(submissionId);
	}

	/**
	 * Sets the submission text of this submission.
	 *
	 * @param submissionText the submission text of this submission
	 */
	@Override
	public void setSubmissionText(String submissionText) {
		model.setSubmissionText(submissionText);
	}

	/**
	 * Sets the submit date of this submission.
	 *
	 * @param submitDate the submit date of this submission
	 */
	@Override
	public void setSubmitDate(Date submitDate) {
		model.setSubmitDate(submitDate);
	}

	/**
	 * Sets the user ID of this submission.
	 *
	 * @param userId the user ID of this submission
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this submission.
	 *
	 * @param userName the user name of this submission
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this submission.
	 *
	 * @param userUuid the user uuid of this submission
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this submission.
	 *
	 * @param uuid the uuid of this submission
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected SubmissionWrapper wrap(Submission submission) {
		return new SubmissionWrapper(submission);
	}

}
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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.gradebook.service.http.SubmissionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubmissionSoap implements Serializable {

	public static SubmissionSoap toSoapModel(Submission model) {
		SubmissionSoap soapModel = new SubmissionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSubmissionId(model.getSubmissionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStudentId(model.getStudentId());
		soapModel.setSubmitDate(model.getSubmitDate());
		soapModel.setSubmisionText(model.getSubmisionText());
		soapModel.setComment(model.getComment());
		soapModel.setGrade(model.getGrade());
		soapModel.setAssignmentId(model.getAssignmentId());

		return soapModel;
	}

	public static SubmissionSoap[] toSoapModels(Submission[] models) {
		SubmissionSoap[] soapModels = new SubmissionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SubmissionSoap[][] toSoapModels(Submission[][] models) {
		SubmissionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SubmissionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SubmissionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SubmissionSoap[] toSoapModels(List<Submission> models) {
		List<SubmissionSoap> soapModels = new ArrayList<SubmissionSoap>(
			models.size());

		for (Submission model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SubmissionSoap[soapModels.size()]);
	}

	public SubmissionSoap() {
	}

	public long getPrimaryKey() {
		return _submissionId;
	}

	public void setPrimaryKey(long pk) {
		setSubmissionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSubmissionId() {
		return _submissionId;
	}

	public void setSubmissionId(long submissionId) {
		_submissionId = submissionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public Date getSubmitDate() {
		return _submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		_submitDate = submitDate;
	}

	public String getSubmisionText() {
		return _submisionText;
	}

	public void setSubmisionText(String submisionText) {
		_submisionText = submisionText;
	}

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public int getGrade() {
		return _grade;
	}

	public void setGrade(int grade) {
		_grade = grade;
	}

	public long getAssignmentId() {
		return _assignmentId;
	}

	public void setAssignmentId(long assignmentId) {
		_assignmentId = assignmentId;
	}

	private String _uuid;
	private long _submissionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _studentId;
	private Date _submitDate;
	private String _submisionText;
	private String _comment;
	private int _grade;
	private long _assignmentId;

}
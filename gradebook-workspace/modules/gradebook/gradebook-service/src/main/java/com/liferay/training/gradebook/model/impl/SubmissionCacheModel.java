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

package com.liferay.training.gradebook.model.impl;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.training.gradebook.model.Submission;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Submission in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubmissionCacheModel
	implements CacheModel<Submission>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SubmissionCacheModel)) {
			return false;
		}

		SubmissionCacheModel submissionCacheModel =
			(SubmissionCacheModel)object;

		if (submissionId == submissionCacheModel.submissionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, submissionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", submissionId=");
		sb.append(submissionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", studentId=");
		sb.append(studentId);
		sb.append(", submitDate=");
		sb.append(submitDate);
		sb.append(", submisionText=");
		sb.append(submisionText);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", grade=");
		sb.append(grade);
		sb.append(", assignmentId=");
		sb.append(assignmentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Submission toEntityModel() {
		SubmissionImpl submissionImpl = new SubmissionImpl();

		if (uuid == null) {
			submissionImpl.setUuid("");
		}
		else {
			submissionImpl.setUuid(uuid);
		}

		submissionImpl.setSubmissionId(submissionId);
		submissionImpl.setGroupId(groupId);
		submissionImpl.setCompanyId(companyId);
		submissionImpl.setUserId(userId);

		if (userName == null) {
			submissionImpl.setUserName("");
		}
		else {
			submissionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			submissionImpl.setCreateDate(null);
		}
		else {
			submissionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			submissionImpl.setModifiedDate(null);
		}
		else {
			submissionImpl.setModifiedDate(new Date(modifiedDate));
		}

		submissionImpl.setStudentId(studentId);

		if (submitDate == Long.MIN_VALUE) {
			submissionImpl.setSubmitDate(null);
		}
		else {
			submissionImpl.setSubmitDate(new Date(submitDate));
		}

		if (submisionText == null) {
			submissionImpl.setSubmisionText("");
		}
		else {
			submissionImpl.setSubmisionText(submisionText);
		}

		if (comment == null) {
			submissionImpl.setComment("");
		}
		else {
			submissionImpl.setComment(comment);
		}

		submissionImpl.setGrade(grade);
		submissionImpl.setAssignmentId(assignmentId);

		submissionImpl.resetOriginalValues();

		return submissionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		submissionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		studentId = objectInput.readLong();
		submitDate = objectInput.readLong();
		submisionText = objectInput.readUTF();
		comment = objectInput.readUTF();

		grade = objectInput.readInt();

		assignmentId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(submissionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(studentId);
		objectOutput.writeLong(submitDate);

		if (submisionText == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(submisionText);
		}

		if (comment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comment);
		}

		objectOutput.writeInt(grade);

		objectOutput.writeLong(assignmentId);
	}

	public String uuid;
	public long submissionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long studentId;
	public long submitDate;
	public String submisionText;
	public String comment;
	public int grade;
	public long assignmentId;

}
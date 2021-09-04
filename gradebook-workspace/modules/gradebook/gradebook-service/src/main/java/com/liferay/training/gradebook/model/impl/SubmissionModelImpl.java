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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.training.gradebook.model.Submission;
import com.liferay.training.gradebook.model.SubmissionModel;
import com.liferay.training.gradebook.model.SubmissionSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Submission service. Represents a row in the &quot;Gradebook_Submission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SubmissionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SubmissionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionImpl
 * @generated
 */
@JSON(strict = true)
public class SubmissionModelImpl
	extends BaseModelImpl<Submission> implements SubmissionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a submission model instance should use the <code>Submission</code> interface instead.
	 */
	public static final String TABLE_NAME = "Gradebook_Submission";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"submissionId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"studentId", Types.BIGINT}, {"submitDate", Types.TIMESTAMP},
		{"submisionText", Types.VARCHAR}, {"comment_", Types.VARCHAR},
		{"grade", Types.INTEGER}, {"assignmentId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("submissionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("studentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("submitDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("submisionText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comment_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("grade", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("assignmentId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Gradebook_Submission (uuid_ VARCHAR(75) null,submissionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,studentId LONG,submitDate DATE null,submisionText VARCHAR(75) null,comment_ VARCHAR(75) null,grade INTEGER,assignmentId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table Gradebook_Submission";

	public static final String ORDER_BY_JPQL =
		" ORDER BY submission.submissionId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Gradebook_Submission.submissionId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.training.gradebook.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.training.gradebook.model.Submission"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.training.gradebook.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.training.gradebook.model.Submission"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.training.gradebook.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.training.gradebook.model.Submission"),
		true);

	public static final long ASSIGNMENTID_COLUMN_BITMASK = 1L;

	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	public static final long GROUPID_COLUMN_BITMASK = 4L;

	public static final long STUDENTID_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

	public static final long SUBMISSIONID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Submission toModel(SubmissionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Submission model = new SubmissionImpl();

		model.setUuid(soapModel.getUuid());
		model.setSubmissionId(soapModel.getSubmissionId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setStudentId(soapModel.getStudentId());
		model.setSubmitDate(soapModel.getSubmitDate());
		model.setSubmisionText(soapModel.getSubmisionText());
		model.setComment(soapModel.getComment());
		model.setGrade(soapModel.getGrade());
		model.setAssignmentId(soapModel.getAssignmentId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Submission> toModels(SubmissionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Submission> models = new ArrayList<Submission>(soapModels.length);

		for (SubmissionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.training.gradebook.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.training.gradebook.model.Submission"));

	public SubmissionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _submissionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSubmissionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _submissionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Submission.class;
	}

	@Override
	public String getModelClassName() {
		return Submission.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Submission, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Submission, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Submission, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Submission)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Submission, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Submission, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Submission)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Submission, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Submission, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Submission>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Submission.class.getClassLoader(), Submission.class,
			ModelWrapper.class);

		try {
			Constructor<Submission> constructor =
				(Constructor<Submission>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Submission, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Submission, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Submission, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Submission, Object>>();
		Map<String, BiConsumer<Submission, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Submission, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(Submission submission, Object uuidObject) {
					submission.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"submissionId",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getSubmissionId();
				}

			});
		attributeSetterBiConsumers.put(
			"submissionId",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object submissionIdObject) {

					submission.setSubmissionId((Long)submissionIdObject);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object groupIdObject) {

					submission.setGroupId((Long)groupIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object companyIdObject) {

					submission.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(Submission submission, Object userIdObject) {
					submission.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object userNameObject) {

					submission.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object createDateObject) {

					submission.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object modifiedDateObject) {

					submission.setModifiedDate((Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"studentId",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getStudentId();
				}

			});
		attributeSetterBiConsumers.put(
			"studentId",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object studentIdObject) {

					submission.setStudentId((Long)studentIdObject);
				}

			});
		attributeGetterFunctions.put(
			"submitDate",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getSubmitDate();
				}

			});
		attributeSetterBiConsumers.put(
			"submitDate",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object submitDateObject) {

					submission.setSubmitDate((Date)submitDateObject);
				}

			});
		attributeGetterFunctions.put(
			"submisionText",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getSubmisionText();
				}

			});
		attributeSetterBiConsumers.put(
			"submisionText",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object submisionTextObject) {

					submission.setSubmisionText((String)submisionTextObject);
				}

			});
		attributeGetterFunctions.put(
			"comment",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getComment();
				}

			});
		attributeSetterBiConsumers.put(
			"comment",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object commentObject) {

					submission.setComment((String)commentObject);
				}

			});
		attributeGetterFunctions.put(
			"grade",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getGrade();
				}

			});
		attributeSetterBiConsumers.put(
			"grade",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(Submission submission, Object gradeObject) {
					submission.setGrade((Integer)gradeObject);
				}

			});
		attributeGetterFunctions.put(
			"assignmentId",
			new Function<Submission, Object>() {

				@Override
				public Object apply(Submission submission) {
					return submission.getAssignmentId();
				}

			});
		attributeSetterBiConsumers.put(
			"assignmentId",
			new BiConsumer<Submission, Object>() {

				@Override
				public void accept(
					Submission submission, Object assignmentIdObject) {

					submission.setAssignmentId((Long)assignmentIdObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getSubmissionId() {
		return _submissionId;
	}

	@Override
	public void setSubmissionId(long submissionId) {
		_submissionId = submissionId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getStudentId() {
		return _studentId;
	}

	@Override
	public void setStudentId(long studentId) {
		_columnBitmask |= STUDENTID_COLUMN_BITMASK;

		if (!_setOriginalStudentId) {
			_setOriginalStudentId = true;

			_originalStudentId = _studentId;
		}

		_studentId = studentId;
	}

	public long getOriginalStudentId() {
		return _originalStudentId;
	}

	@JSON
	@Override
	public Date getSubmitDate() {
		return _submitDate;
	}

	@Override
	public void setSubmitDate(Date submitDate) {
		_submitDate = submitDate;
	}

	@JSON
	@Override
	public String getSubmisionText() {
		if (_submisionText == null) {
			return "";
		}
		else {
			return _submisionText;
		}
	}

	@Override
	public void setSubmisionText(String submisionText) {
		_submisionText = submisionText;
	}

	@JSON
	@Override
	public String getComment() {
		if (_comment == null) {
			return "";
		}
		else {
			return _comment;
		}
	}

	@Override
	public void setComment(String comment) {
		_comment = comment;
	}

	@JSON
	@Override
	public int getGrade() {
		return _grade;
	}

	@Override
	public void setGrade(int grade) {
		_grade = grade;
	}

	@JSON
	@Override
	public long getAssignmentId() {
		return _assignmentId;
	}

	@Override
	public void setAssignmentId(long assignmentId) {
		_columnBitmask |= ASSIGNMENTID_COLUMN_BITMASK;

		if (!_setOriginalAssignmentId) {
			_setOriginalAssignmentId = true;

			_originalAssignmentId = _assignmentId;
		}

		_assignmentId = assignmentId;
	}

	public long getOriginalAssignmentId() {
		return _originalAssignmentId;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Submission.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Submission.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Submission toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Submission>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SubmissionImpl submissionImpl = new SubmissionImpl();

		submissionImpl.setUuid(getUuid());
		submissionImpl.setSubmissionId(getSubmissionId());
		submissionImpl.setGroupId(getGroupId());
		submissionImpl.setCompanyId(getCompanyId());
		submissionImpl.setUserId(getUserId());
		submissionImpl.setUserName(getUserName());
		submissionImpl.setCreateDate(getCreateDate());
		submissionImpl.setModifiedDate(getModifiedDate());
		submissionImpl.setStudentId(getStudentId());
		submissionImpl.setSubmitDate(getSubmitDate());
		submissionImpl.setSubmisionText(getSubmisionText());
		submissionImpl.setComment(getComment());
		submissionImpl.setGrade(getGrade());
		submissionImpl.setAssignmentId(getAssignmentId());

		submissionImpl.resetOriginalValues();

		return submissionImpl;
	}

	@Override
	public int compareTo(Submission submission) {
		long primaryKey = submission.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Submission)) {
			return false;
		}

		Submission submission = (Submission)object;

		long primaryKey = submission.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalGroupId = _groupId;

		_setOriginalGroupId = false;

		_originalCompanyId = _companyId;

		_setOriginalCompanyId = false;

		_setModifiedDate = false;
		_originalStudentId = _studentId;

		_setOriginalStudentId = false;

		_originalAssignmentId = _assignmentId;

		_setOriginalAssignmentId = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Submission> toCacheModel() {
		SubmissionCacheModel submissionCacheModel = new SubmissionCacheModel();

		submissionCacheModel.uuid = getUuid();

		String uuid = submissionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			submissionCacheModel.uuid = null;
		}

		submissionCacheModel.submissionId = getSubmissionId();

		submissionCacheModel.groupId = getGroupId();

		submissionCacheModel.companyId = getCompanyId();

		submissionCacheModel.userId = getUserId();

		submissionCacheModel.userName = getUserName();

		String userName = submissionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			submissionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			submissionCacheModel.createDate = createDate.getTime();
		}
		else {
			submissionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			submissionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			submissionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		submissionCacheModel.studentId = getStudentId();

		Date submitDate = getSubmitDate();

		if (submitDate != null) {
			submissionCacheModel.submitDate = submitDate.getTime();
		}
		else {
			submissionCacheModel.submitDate = Long.MIN_VALUE;
		}

		submissionCacheModel.submisionText = getSubmisionText();

		String submisionText = submissionCacheModel.submisionText;

		if ((submisionText != null) && (submisionText.length() == 0)) {
			submissionCacheModel.submisionText = null;
		}

		submissionCacheModel.comment = getComment();

		String comment = submissionCacheModel.comment;

		if ((comment != null) && (comment.length() == 0)) {
			submissionCacheModel.comment = null;
		}

		submissionCacheModel.grade = getGrade();

		submissionCacheModel.assignmentId = getAssignmentId();

		return submissionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Submission, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Submission, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Submission, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Submission)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Submission, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Submission, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Submission, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Submission)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Submission>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _submissionId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _studentId;
	private long _originalStudentId;
	private boolean _setOriginalStudentId;
	private Date _submitDate;
	private String _submisionText;
	private String _comment;
	private int _grade;
	private long _assignmentId;
	private long _originalAssignmentId;
	private boolean _setOriginalAssignmentId;
	private long _columnBitmask;
	private Submission _escapedModel;

}
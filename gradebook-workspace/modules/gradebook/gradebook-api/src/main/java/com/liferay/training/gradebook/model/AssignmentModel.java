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

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the Assignment service. Represents a row in the &quot;Gradebook_Assignment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.training.gradebook.model.impl.AssignmentModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.training.gradebook.model.impl.AssignmentImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Assignment
 * @generated
 */
@ProviderType
public interface AssignmentModel
	extends BaseModel<Assignment>, GroupedModel, LocalizedModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assignment model instance should use the {@link Assignment} interface instead.
	 */

	/**
	 * Returns the primary key of this assignment.
	 *
	 * @return the primary key of this assignment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assignment.
	 *
	 * @param primaryKey the primary key of this assignment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this assignment.
	 *
	 * @return the uuid of this assignment
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this assignment.
	 *
	 * @param uuid the uuid of this assignment
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the assignment ID of this assignment.
	 *
	 * @return the assignment ID of this assignment
	 */
	public long getAssignmentId();

	/**
	 * Sets the assignment ID of this assignment.
	 *
	 * @param assignmentId the assignment ID of this assignment
	 */
	public void setAssignmentId(long assignmentId);

	/**
	 * Returns the group ID of this assignment.
	 *
	 * @return the group ID of this assignment
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this assignment.
	 *
	 * @param groupId the group ID of this assignment
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this assignment.
	 *
	 * @return the company ID of this assignment
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this assignment.
	 *
	 * @param companyId the company ID of this assignment
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this assignment.
	 *
	 * @return the user ID of this assignment
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this assignment.
	 *
	 * @param userId the user ID of this assignment
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this assignment.
	 *
	 * @return the user uuid of this assignment
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this assignment.
	 *
	 * @param userUuid the user uuid of this assignment
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this assignment.
	 *
	 * @return the user name of this assignment
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this assignment.
	 *
	 * @param userName the user name of this assignment
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this assignment.
	 *
	 * @return the create date of this assignment
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this assignment.
	 *
	 * @param createDate the create date of this assignment
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this assignment.
	 *
	 * @return the modified date of this assignment
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this assignment.
	 *
	 * @param modifiedDate the modified date of this assignment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this assignment.
	 *
	 * @return the title of this assignment
	 */
	public String getTitle();

	/**
	 * Returns the localized title of this assignment in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this assignment
	 */
	@AutoEscape
	public String getTitle(Locale locale);

	/**
	 * Returns the localized title of this assignment in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this assignment. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Returns the localized title of this assignment in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this assignment
	 */
	@AutoEscape
	public String getTitle(String languageId);

	/**
	 * Returns the localized title of this assignment in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this assignment
	 */
	@AutoEscape
	public String getTitle(String languageId, boolean useDefault);

	@AutoEscape
	public String getTitleCurrentLanguageId();

	@AutoEscape
	public String getTitleCurrentValue();

	/**
	 * Returns a map of the locales and localized titles of this assignment.
	 *
	 * @return the locales and localized titles of this assignment
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this assignment.
	 *
	 * @param title the title of this assignment
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this assignment in the language.
	 *
	 * @param title the localized title of this assignment
	 * @param locale the locale of the language
	 */
	public void setTitle(String title, Locale locale);

	/**
	 * Sets the localized title of this assignment in the language, and sets the default locale.
	 *
	 * @param title the localized title of this assignment
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setTitle(String title, Locale locale, Locale defaultLocale);

	public void setTitleCurrentLanguageId(String languageId);

	/**
	 * Sets the localized titles of this assignment from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this assignment
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	/**
	 * Sets the localized titles of this assignment from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this assignment
	 * @param defaultLocale the default locale
	 */
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Returns the description of this assignment.
	 *
	 * @return the description of this assignment
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this assignment.
	 *
	 * @param description the description of this assignment
	 */
	public void setDescription(String description);

	/**
	 * Returns the due date of this assignment.
	 *
	 * @return the due date of this assignment
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this assignment.
	 *
	 * @param dueDate the due date of this assignment
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the status of this assignment.
	 *
	 * @return the status of this assignment
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this assignment.
	 *
	 * @param status the status of this assignment
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this assignment.
	 *
	 * @return the status by user ID of this assignment
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this assignment.
	 *
	 * @param statusByUserId the status by user ID of this assignment
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this assignment.
	 *
	 * @return the status by user uuid of this assignment
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this assignment.
	 *
	 * @param statusByUserUuid the status by user uuid of this assignment
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this assignment.
	 *
	 * @return the status by user name of this assignment
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this assignment.
	 *
	 * @param statusByUserName the status by user name of this assignment
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this assignment.
	 *
	 * @return the status date of this assignment
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this assignment.
	 *
	 * @param statusDate the status date of this assignment
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this assignment is approved.
	 *
	 * @return <code>true</code> if this assignment is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this assignment is denied.
	 *
	 * @return <code>true</code> if this assignment is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this assignment is a draft.
	 *
	 * @return <code>true</code> if this assignment is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this assignment is expired.
	 *
	 * @return <code>true</code> if this assignment is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this assignment is inactive.
	 *
	 * @return <code>true</code> if this assignment is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this assignment is incomplete.
	 *
	 * @return <code>true</code> if this assignment is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this assignment is pending.
	 *
	 * @return <code>true</code> if this assignment is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this assignment is scheduled.
	 *
	 * @return <code>true</code> if this assignment is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(Assignment assignment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Assignment> toCacheModel();

	@Override
	public Assignment toEscapedModel();

	@Override
	public Assignment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}
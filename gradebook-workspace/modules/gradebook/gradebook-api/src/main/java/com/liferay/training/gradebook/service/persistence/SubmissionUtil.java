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

package com.liferay.training.gradebook.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.gradebook.model.Submission;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the submission service. This utility wraps <code>com.liferay.training.gradebook.service.persistence.impl.SubmissionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionPersistence
 * @generated
 */
public class SubmissionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Submission submission) {
		getPersistence().clearCache(submission);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Submission> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Submission> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Submission> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Submission> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Submission update(Submission submission) {
		return getPersistence().update(submission);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Submission update(
		Submission submission, ServiceContext serviceContext) {

		return getPersistence().update(submission, serviceContext);
	}

	/**
	 * Returns all the submissions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching submissions
	 */
	public static List<Submission> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the submissions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @return the range of matching submissions
	 */
	public static List<Submission> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the submissions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the submissions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Submission> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first submission in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByUuid_First(
			String uuid, OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first submission in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByUuid_First(
		String uuid, OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByUuid_Last(
			String uuid, OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByUuid_Last(
		String uuid, OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the submissions before and after the current submission in the ordered set where uuid = &#63;.
	 *
	 * @param submissionId the primary key of the current submission
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next submission
	 * @throws NoSuchSubmissionException if a submission with the primary key could not be found
	 */
	public static Submission[] findByUuid_PrevAndNext(
			long submissionId, String uuid,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByUuid_PrevAndNext(
			submissionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the submissions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of submissions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching submissions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the submission where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSubmissionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the submission where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the submission where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the submission where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the submission that was removed
	 */
	public static Submission removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of submissions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching submissions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the submissions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching submissions
	 */
	public static List<Submission> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the submissions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @return the range of matching submissions
	 */
	public static List<Submission> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the submissions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the submissions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Submission> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first submission in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first submission in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the submissions before and after the current submission in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param submissionId the primary key of the current submission
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next submission
	 * @throws NoSuchSubmissionException if a submission with the primary key could not be found
	 */
	public static Submission[] findByUuid_C_PrevAndNext(
			long submissionId, String uuid, long companyId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			submissionId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the submissions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of submissions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching submissions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the submissions where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching submissions
	 */
	public static List<Submission> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the submissions where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @return the range of matching submissions
	 */
	public static List<Submission> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the submissions where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the submissions where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Submission> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first submission in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByGroupId_First(
			long groupId, OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first submission in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByGroupId_First(
		long groupId, OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByGroupId_Last(
			long groupId, OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByGroupId_Last(
		long groupId, OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the submissions before and after the current submission in the ordered set where groupId = &#63;.
	 *
	 * @param submissionId the primary key of the current submission
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next submission
	 * @throws NoSuchSubmissionException if a submission with the primary key could not be found
	 */
	public static Submission[] findByGroupId_PrevAndNext(
			long submissionId, long groupId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByGroupId_PrevAndNext(
			submissionId, groupId, orderByComparator);
	}

	/**
	 * Removes all the submissions where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of submissions where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching submissions
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the submissions where groupId = &#63; and assignmentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @return the matching submissions
	 */
	public static List<Submission> findByG_A(long groupId, long assignmentId) {
		return getPersistence().findByG_A(groupId, assignmentId);
	}

	/**
	 * Returns a range of all the submissions where groupId = &#63; and assignmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @return the range of matching submissions
	 */
	public static List<Submission> findByG_A(
		long groupId, long assignmentId, int start, int end) {

		return getPersistence().findByG_A(groupId, assignmentId, start, end);
	}

	/**
	 * Returns an ordered range of all the submissions where groupId = &#63; and assignmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByG_A(
		long groupId, long assignmentId, int start, int end,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().findByG_A(
			groupId, assignmentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the submissions where groupId = &#63; and assignmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByG_A(
		long groupId, long assignmentId, int start, int end,
		OrderByComparator<Submission> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_A(
			groupId, assignmentId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first submission in the ordered set where groupId = &#63; and assignmentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByG_A_First(
			long groupId, long assignmentId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByG_A_First(
			groupId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the first submission in the ordered set where groupId = &#63; and assignmentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByG_A_First(
		long groupId, long assignmentId,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByG_A_First(
			groupId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where groupId = &#63; and assignmentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByG_A_Last(
			long groupId, long assignmentId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByG_A_Last(
			groupId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where groupId = &#63; and assignmentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByG_A_Last(
		long groupId, long assignmentId,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByG_A_Last(
			groupId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the submissions before and after the current submission in the ordered set where groupId = &#63; and assignmentId = &#63;.
	 *
	 * @param submissionId the primary key of the current submission
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next submission
	 * @throws NoSuchSubmissionException if a submission with the primary key could not be found
	 */
	public static Submission[] findByG_A_PrevAndNext(
			long submissionId, long groupId, long assignmentId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByG_A_PrevAndNext(
			submissionId, groupId, assignmentId, orderByComparator);
	}

	/**
	 * Removes all the submissions where groupId = &#63; and assignmentId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 */
	public static void removeByG_A(long groupId, long assignmentId) {
		getPersistence().removeByG_A(groupId, assignmentId);
	}

	/**
	 * Returns the number of submissions where groupId = &#63; and assignmentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param assignmentId the assignment ID
	 * @return the number of matching submissions
	 */
	public static int countByG_A(long groupId, long assignmentId) {
		return getPersistence().countByG_A(groupId, assignmentId);
	}

	/**
	 * Returns all the submissions where studentId = &#63; and assignmentId = &#63;.
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @return the matching submissions
	 */
	public static List<Submission> findByStudentIdAssignmentId(
		long studentId, long assignmentId) {

		return getPersistence().findByStudentIdAssignmentId(
			studentId, assignmentId);
	}

	/**
	 * Returns a range of all the submissions where studentId = &#63; and assignmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @return the range of matching submissions
	 */
	public static List<Submission> findByStudentIdAssignmentId(
		long studentId, long assignmentId, int start, int end) {

		return getPersistence().findByStudentIdAssignmentId(
			studentId, assignmentId, start, end);
	}

	/**
	 * Returns an ordered range of all the submissions where studentId = &#63; and assignmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByStudentIdAssignmentId(
		long studentId, long assignmentId, int start, int end,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().findByStudentIdAssignmentId(
			studentId, assignmentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the submissions where studentId = &#63; and assignmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching submissions
	 */
	public static List<Submission> findByStudentIdAssignmentId(
		long studentId, long assignmentId, int start, int end,
		OrderByComparator<Submission> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByStudentIdAssignmentId(
			studentId, assignmentId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first submission in the ordered set where studentId = &#63; and assignmentId = &#63;.
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByStudentIdAssignmentId_First(
			long studentId, long assignmentId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByStudentIdAssignmentId_First(
			studentId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the first submission in the ordered set where studentId = &#63; and assignmentId = &#63;.
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByStudentIdAssignmentId_First(
		long studentId, long assignmentId,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByStudentIdAssignmentId_First(
			studentId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where studentId = &#63; and assignmentId = &#63;.
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission
	 * @throws NoSuchSubmissionException if a matching submission could not be found
	 */
	public static Submission findByStudentIdAssignmentId_Last(
			long studentId, long assignmentId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByStudentIdAssignmentId_Last(
			studentId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the last submission in the ordered set where studentId = &#63; and assignmentId = &#63;.
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchByStudentIdAssignmentId_Last(
		long studentId, long assignmentId,
		OrderByComparator<Submission> orderByComparator) {

		return getPersistence().fetchByStudentIdAssignmentId_Last(
			studentId, assignmentId, orderByComparator);
	}

	/**
	 * Returns the submissions before and after the current submission in the ordered set where studentId = &#63; and assignmentId = &#63;.
	 *
	 * @param submissionId the primary key of the current submission
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next submission
	 * @throws NoSuchSubmissionException if a submission with the primary key could not be found
	 */
	public static Submission[] findByStudentIdAssignmentId_PrevAndNext(
			long submissionId, long studentId, long assignmentId,
			OrderByComparator<Submission> orderByComparator)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByStudentIdAssignmentId_PrevAndNext(
			submissionId, studentId, assignmentId, orderByComparator);
	}

	/**
	 * Removes all the submissions where studentId = &#63; and assignmentId = &#63; from the database.
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 */
	public static void removeByStudentIdAssignmentId(
		long studentId, long assignmentId) {

		getPersistence().removeByStudentIdAssignmentId(studentId, assignmentId);
	}

	/**
	 * Returns the number of submissions where studentId = &#63; and assignmentId = &#63;.
	 *
	 * @param studentId the student ID
	 * @param assignmentId the assignment ID
	 * @return the number of matching submissions
	 */
	public static int countByStudentIdAssignmentId(
		long studentId, long assignmentId) {

		return getPersistence().countByStudentIdAssignmentId(
			studentId, assignmentId);
	}

	/**
	 * Caches the submission in the entity cache if it is enabled.
	 *
	 * @param submission the submission
	 */
	public static void cacheResult(Submission submission) {
		getPersistence().cacheResult(submission);
	}

	/**
	 * Caches the submissions in the entity cache if it is enabled.
	 *
	 * @param submissions the submissions
	 */
	public static void cacheResult(List<Submission> submissions) {
		getPersistence().cacheResult(submissions);
	}

	/**
	 * Creates a new submission with the primary key. Does not add the submission to the database.
	 *
	 * @param submissionId the primary key for the new submission
	 * @return the new submission
	 */
	public static Submission create(long submissionId) {
		return getPersistence().create(submissionId);
	}

	/**
	 * Removes the submission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param submissionId the primary key of the submission
	 * @return the submission that was removed
	 * @throws NoSuchSubmissionException if a submission with the primary key could not be found
	 */
	public static Submission remove(long submissionId)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().remove(submissionId);
	}

	public static Submission updateImpl(Submission submission) {
		return getPersistence().updateImpl(submission);
	}

	/**
	 * Returns the submission with the primary key or throws a <code>NoSuchSubmissionException</code> if it could not be found.
	 *
	 * @param submissionId the primary key of the submission
	 * @return the submission
	 * @throws NoSuchSubmissionException if a submission with the primary key could not be found
	 */
	public static Submission findByPrimaryKey(long submissionId)
		throws com.liferay.training.gradebook.exception.
			NoSuchSubmissionException {

		return getPersistence().findByPrimaryKey(submissionId);
	}

	/**
	 * Returns the submission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param submissionId the primary key of the submission
	 * @return the submission, or <code>null</code> if a submission with the primary key could not be found
	 */
	public static Submission fetchByPrimaryKey(long submissionId) {
		return getPersistence().fetchByPrimaryKey(submissionId);
	}

	/**
	 * Returns all the submissions.
	 *
	 * @return the submissions
	 */
	public static List<Submission> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @return the range of submissions
	 */
	public static List<Submission> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of submissions
	 */
	public static List<Submission> findAll(
		int start, int end, OrderByComparator<Submission> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of submissions
	 */
	public static List<Submission> findAll(
		int start, int end, OrderByComparator<Submission> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the submissions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of submissions.
	 *
	 * @return the number of submissions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SubmissionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SubmissionPersistence, SubmissionPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SubmissionPersistence.class);

		ServiceTracker<SubmissionPersistence, SubmissionPersistence>
			serviceTracker =
				new ServiceTracker
					<SubmissionPersistence, SubmissionPersistence>(
						bundle.getBundleContext(), SubmissionPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
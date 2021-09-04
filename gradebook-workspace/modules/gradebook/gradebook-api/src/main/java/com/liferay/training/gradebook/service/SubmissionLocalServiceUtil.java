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

package com.liferay.training.gradebook.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.gradebook.model.Submission;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Submission. This utility wraps
 * <code>com.liferay.training.gradebook.service.impl.SubmissionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionLocalService
 * @generated
 */
public class SubmissionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.gradebook.service.impl.SubmissionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Submission addSubmission(
			long assignmentId, long studentId, String submissionText,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addSubmission(
			assignmentId, studentId, submissionText, serviceContext);
	}

	/**
	 * Adds the submission to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param submission the submission
	 * @return the submission that was added
	 */
	public static Submission addSubmission(Submission submission) {
		return getService().addSubmission(submission);
	}

	/**
	 * Creates a new submission with the primary key. Does not add the submission to the database.
	 *
	 * @param submissionId the primary key for the new submission
	 * @return the new submission
	 */
	public static Submission createSubmission(long submissionId) {
		return getService().createSubmission(submissionId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the submission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param submissionId the primary key of the submission
	 * @return the submission that was removed
	 * @throws PortalException if a submission with the primary key could not be found
	 */
	public static Submission deleteSubmission(long submissionId)
		throws PortalException {

		return getService().deleteSubmission(submissionId);
	}

	/**
	 * Deletes the submission from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param submission the submission
	 * @return the submission that was removed
	 */
	public static Submission deleteSubmission(Submission submission) {
		return getService().deleteSubmission(submission);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.gradebook.model.impl.SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.gradebook.model.impl.SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Submission fetchSubmission(long submissionId) {
		return getService().fetchSubmission(submissionId);
	}

	/**
	 * Returns the submission matching the UUID and group.
	 *
	 * @param uuid the submission's UUID
	 * @param groupId the primary key of the group
	 * @return the matching submission, or <code>null</code> if a matching submission could not be found
	 */
	public static Submission fetchSubmissionByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchSubmissionByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the submission with the primary key.
	 *
	 * @param submissionId the primary key of the submission
	 * @return the submission
	 * @throws PortalException if a submission with the primary key could not be found
	 */
	public static Submission getSubmission(long submissionId)
		throws PortalException {

		return getService().getSubmission(submissionId);
	}

	/**
	 * Returns the submission matching the UUID and group.
	 *
	 * @param uuid the submission's UUID
	 * @param groupId the primary key of the group
	 * @return the matching submission
	 * @throws PortalException if a matching submission could not be found
	 */
	public static Submission getSubmissionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getSubmissionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.gradebook.model.impl.SubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @return the range of submissions
	 */
	public static List<Submission> getSubmissions(int start, int end) {
		return getService().getSubmissions(start, end);
	}

	public static List<Submission> getSubmissionsByAssignment(
		long groupId, long assignmentId) {

		return getService().getSubmissionsByAssignment(groupId, assignmentId);
	}

	public static List<Submission> getSubmissionsByAssignment(
		long groupId, long assignmentId, int start, int end) {

		return getService().getSubmissionsByAssignment(
			groupId, assignmentId, start, end);
	}

	/**
	 * Returns all the submissions matching the UUID and company.
	 *
	 * @param uuid the UUID of the submissions
	 * @param companyId the primary key of the company
	 * @return the matching submissions, or an empty list if no matches were found
	 */
	public static List<Submission> getSubmissionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getSubmissionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of submissions matching the UUID and company.
	 *
	 * @param uuid the UUID of the submissions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of submissions
	 * @param end the upper bound of the range of submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching submissions, or an empty list if no matches were found
	 */
	public static List<Submission> getSubmissionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Submission> orderByComparator) {

		return getService().getSubmissionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of submissions.
	 *
	 * @return the number of submissions
	 */
	public static int getSubmissionsCount() {
		return getService().getSubmissionsCount();
	}

	public static int getSubmissionsCountByAssignment(
		long groupId, long assignmentId) {

		return getService().getSubmissionsCountByAssignment(
			groupId, assignmentId);
	}

	public static Submission gradeAndCommentSubmission(
			long submissionId, int grade, String comment)
		throws PortalException {

		return getService().gradeAndCommentSubmission(
			submissionId, grade, comment);
	}

	public static Submission gradeSubmission(long submissionId, int grade)
		throws PortalException {

		return getService().gradeSubmission(submissionId, grade);
	}

	public static Submission updateSubmission(
			long submissionId, String submissionText,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateSubmission(
			submissionId, submissionText, serviceContext);
	}

	/**
	 * Updates the submission in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param submission the submission
	 * @return the submission that was updated
	 */
	public static Submission updateSubmission(Submission submission) {
		return getService().updateSubmission(submission);
	}

	public static SubmissionLocalService getService() {
		return _service;
	}

	private static volatile SubmissionLocalService _service;

}
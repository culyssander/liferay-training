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

package com.liferay.training.gradebook.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.gradebook.service.SubmissionServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>SubmissionServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.training.gradebook.model.SubmissionSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.training.gradebook.model.Submission</code>, that is translated to a
 * <code>com.liferay.training.gradebook.model.SubmissionSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class SubmissionServiceSoap {

	public static com.liferay.training.gradebook.model.SubmissionSoap
			addSubmission(
				long assignmentId, long studentId, String submissionText,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.gradebook.model.Submission returnValue =
				SubmissionServiceUtil.addSubmission(
					assignmentId, studentId, submissionText, serviceContext);

			return com.liferay.training.gradebook.model.SubmissionSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.gradebook.model.SubmissionSoap
			deleteSubmission(long submissionId)
		throws RemoteException {

		try {
			com.liferay.training.gradebook.model.Submission returnValue =
				SubmissionServiceUtil.deleteSubmission(submissionId);

			return com.liferay.training.gradebook.model.SubmissionSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.gradebook.model.SubmissionSoap[]
			getSubmissionsByAssignment(long groupId, long assignmentId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.gradebook.model.Submission>
				returnValue = SubmissionServiceUtil.getSubmissionsByAssignment(
					groupId, assignmentId);

			return com.liferay.training.gradebook.model.SubmissionSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.gradebook.model.SubmissionSoap[]
			getSubmissionsByAssignment(
				long groupId, long assignmentId, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.gradebook.model.Submission>
				returnValue = SubmissionServiceUtil.getSubmissionsByAssignment(
					groupId, assignmentId, start, end);

			return com.liferay.training.gradebook.model.SubmissionSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int getSubmissionsCountByAssignment(
			long groupId, long assignmentId)
		throws RemoteException {

		try {
			int returnValue =
				SubmissionServiceUtil.getSubmissionsCountByAssignment(
					groupId, assignmentId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.gradebook.model.SubmissionSoap
			gradeAndCommentSubmission(
				long submissionId, int grade, String comment)
		throws RemoteException {

		try {
			com.liferay.training.gradebook.model.Submission returnValue =
				SubmissionServiceUtil.gradeAndCommentSubmission(
					submissionId, grade, comment);

			return com.liferay.training.gradebook.model.SubmissionSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.gradebook.model.SubmissionSoap
			gradeSubmission(long submissionId, int grade)
		throws RemoteException {

		try {
			com.liferay.training.gradebook.model.Submission returnValue =
				SubmissionServiceUtil.gradeSubmission(submissionId, grade);

			return com.liferay.training.gradebook.model.SubmissionSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.gradebook.model.SubmissionSoap
			updateSubmission(
				long submissionId, String submissionText,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.gradebook.model.Submission returnValue =
				SubmissionServiceUtil.updateSubmission(
					submissionId, submissionText, serviceContext);

			return com.liferay.training.gradebook.model.SubmissionSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		SubmissionServiceSoap.class);

}
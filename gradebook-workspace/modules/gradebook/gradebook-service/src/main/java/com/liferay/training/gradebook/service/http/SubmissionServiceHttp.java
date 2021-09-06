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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.training.gradebook.service.SubmissionServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>SubmissionServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionServiceSoap
 * @generated
 */
public class SubmissionServiceHttp {

	public static com.liferay.training.gradebook.model.Submission addSubmission(
			HttpPrincipal httpPrincipal, long assignmentId, long studentId,
			String submissionText,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "addSubmission",
				_addSubmissionParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, assignmentId, studentId, submissionText,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.gradebook.model.Submission)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.gradebook.model.Submission
			deleteSubmission(HttpPrincipal httpPrincipal, long submissionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "deleteSubmission",
				_deleteSubmissionParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, submissionId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.gradebook.model.Submission)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.training.gradebook.model.Submission>
			getSubmissionsByAssignment(
				HttpPrincipal httpPrincipal, long groupId, long assignmentId) {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "getSubmissionsByAssignment",
				_getSubmissionsByAssignmentParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, assignmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.gradebook.model.Submission>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.training.gradebook.model.Submission>
			getSubmissionsByAssignment(
				HttpPrincipal httpPrincipal, long groupId, long assignmentId,
				int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "getSubmissionsByAssignment",
				_getSubmissionsByAssignmentParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, assignmentId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.gradebook.model.Submission>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getSubmissionsCountByAssignment(
		HttpPrincipal httpPrincipal, long groupId, long assignmentId) {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "getSubmissionsCountByAssignment",
				_getSubmissionsCountByAssignmentParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, assignmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.gradebook.model.Submission
			gradeAndCommentSubmission(
				HttpPrincipal httpPrincipal, long submissionId, int grade,
				String comment)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "gradeAndCommentSubmission",
				_gradeAndCommentSubmissionParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, submissionId, grade, comment);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.gradebook.model.Submission)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.gradebook.model.Submission
			gradeSubmission(
				HttpPrincipal httpPrincipal, long submissionId, int grade)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "gradeSubmission",
				_gradeSubmissionParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, submissionId, grade);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.gradebook.model.Submission)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.gradebook.model.Submission
			updateSubmission(
				HttpPrincipal httpPrincipal, long submissionId,
				String submissionText,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SubmissionServiceUtil.class, "updateSubmission",
				_updateSubmissionParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, submissionId, submissionText, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.gradebook.model.Submission)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		SubmissionServiceHttp.class);

	private static final Class<?>[] _addSubmissionParameterTypes0 =
		new Class[] {
			long.class, long.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteSubmissionParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getSubmissionsByAssignmentParameterTypes2 =
		new Class[] {long.class, long.class};
	private static final Class<?>[] _getSubmissionsByAssignmentParameterTypes3 =
		new Class[] {long.class, long.class, int.class, int.class};
	private static final Class<?>[]
		_getSubmissionsCountByAssignmentParameterTypes4 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _gradeAndCommentSubmissionParameterTypes5 =
		new Class[] {long.class, int.class, String.class};
	private static final Class<?>[] _gradeSubmissionParameterTypes6 =
		new Class[] {long.class, int.class};
	private static final Class<?>[] _updateSubmissionParameterTypes7 =
		new Class[] {
			long.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};

}
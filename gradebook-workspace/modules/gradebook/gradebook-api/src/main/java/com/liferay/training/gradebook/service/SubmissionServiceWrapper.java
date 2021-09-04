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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubmissionService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubmissionService
 * @generated
 */
public class SubmissionServiceWrapper
	implements ServiceWrapper<SubmissionService>, SubmissionService {

	public SubmissionServiceWrapper(SubmissionService submissionService) {
		_submissionService = submissionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _submissionService.getOSGiServiceIdentifier();
	}

	@Override
	public SubmissionService getWrappedService() {
		return _submissionService;
	}

	@Override
	public void setWrappedService(SubmissionService submissionService) {
		_submissionService = submissionService;
	}

	private SubmissionService _submissionService;

}
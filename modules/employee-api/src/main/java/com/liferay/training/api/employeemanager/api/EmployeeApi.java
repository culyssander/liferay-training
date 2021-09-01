package com.liferay.training.api.employeemanager.api;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author Quitumba
 */
public interface EmployeeApi<T> extends Serializable {
	
	T save(T t);
	
	Optional<T> findById(Long id);
	
	List<T> findAll();
}
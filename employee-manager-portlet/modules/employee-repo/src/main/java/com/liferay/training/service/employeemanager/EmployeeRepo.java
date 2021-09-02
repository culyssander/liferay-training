package com.liferay.training.service.employeemanager;

import com.liferay.training.api.employeemanager.api.EmployeeApi;
import com.liferay.training.model.employeemanager.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.osgi.service.component.annotations.Component;

/**
 * @author Quitumba
 */
@Component(
	immediate = true,
	property = {},
	service = EmployeeApi.class
)
public class EmployeeRepo implements EmployeeApi<Employee> {
	
	private static final long serialVersionUID = 1L;
	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public Employee save(Employee t) {
		this.employees.add(t);
		return t;
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employees.stream()
						.filter(e -> e.getId().equals(id))
						.findFirst();
	}

	@Override
	public List<Employee> findAll() {
		return employees;
	}

}
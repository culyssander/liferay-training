package com.liferay.training.model.employeemanager;

import java.time.LocalDateTime;
import java.util.UUID;

public class Employee {

	private UUID id;
	private String name;
	private String email;
	private String jobTitle;
	private LocalDateTime createAt;
	
	public Employee(String name, String email, String jobTitle) {
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.id = UUID.randomUUID();
		this.createAt = LocalDateTime.now();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", createAt="
				+ createAt + "]";
	}
}

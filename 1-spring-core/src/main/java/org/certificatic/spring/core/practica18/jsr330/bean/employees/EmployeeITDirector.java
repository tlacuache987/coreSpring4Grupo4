package org.certificatic.spring.core.practica18.jsr330.bean.employees;

import javax.inject.Named;
import javax.inject.Singleton;

import org.certificatic.spring.core.practica18.jsr330.bean.Employee;

@Named("itDirectorEmployee")
@Singleton
public class EmployeeITDirector extends Employee {

	public EmployeeITDirector() {
		this.name = "Ivan Garcia";
		this.dni = "00-11-22-33";
	}
}

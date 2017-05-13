package org.certificatic.spring.core.practica18.jsr330.bean.employees.teamx;

import javax.inject.Named;
import javax.inject.Singleton;

import org.certificatic.spring.core.practica18.jsr330.bean.Employee;
import org.certificatic.spring.core.practica18.jsr330.qualifiers.EmployeeQualifier;
import org.certificatic.spring.core.practica18.jsr330.qualifiers.EmployeeQualifier.EmployeeType;

@Named
@Singleton
@EmployeeQualifier(employeeType = EmployeeType.TESTER)
public class EmployeeTester extends Employee {

	public EmployeeTester() {
		this.name = "Team Leader Tester";
		this.dni = "AA-BB-CC-DD";
	}
}

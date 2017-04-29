package org.certificatic.spring.core.practica8.factorymethod.factories;

import org.certificatic.spring.core.practica8.factorymethod.bean.Student;

public class StudentFactory {

	public Student getStudent(String nombre, String materia) {
		return Student.constructStudent(nombre, materia);
	}
}

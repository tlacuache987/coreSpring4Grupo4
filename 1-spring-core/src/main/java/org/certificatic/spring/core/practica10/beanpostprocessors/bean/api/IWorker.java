package org.certificatic.spring.core.practica10.beanpostprocessors.bean.api;

public interface IWorker {

	void setName(String name);

	String getName();

	void setAge(int age);

	int getAge();

	void init();

	void showInfo();

	void destroy();

}

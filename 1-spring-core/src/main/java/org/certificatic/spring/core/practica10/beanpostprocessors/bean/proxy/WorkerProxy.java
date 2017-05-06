package org.certificatic.spring.core.practica10.beanpostprocessors.bean.proxy;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.api.IWorker;

import lombok.Setter;
import lombok.ToString;

@ToString
public class WorkerProxy implements IWorker {

	private @Setter IWorker originalWorker;

	@Override
	public void setName(String name) {
		originalWorker.setName(name);
	}

	@Override
	public String getName() {
		return originalWorker.getName();
	}

	@Override
	public void setAge(int age) {
		originalWorker.setAge(age);
	}

	@Override
	public int getAge() {
		return originalWorker.getAge();
	}

	@Override
	public void init() {
		System.out.println("[Proxy... aqui puedo hacer otras cosas]");
		originalWorker.init();
		System.out.println("[Proxy... y qui tambien]");
	}

	@Override
	public void showInfo() {
		System.out.println("[Proxy... aqui puedo hacer otras cosas]");
		originalWorker.showInfo();
		System.out.println("[Proxy... y qui tambien]");
	}

	@Override
	public void destroy() {
		System.out.println("[Proxy... aqui puedo hacer otras cosas]");
		originalWorker.destroy();
		System.out.println("[Proxy... y qui tambien]");
	}
}

package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.Worker;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor1 implements BeanPostProcessor, Ordered {

	@Override
	public int getOrder() {
		return 1;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {

		System.out.println("[Bean Post Processor Before Initialization " + this.getOrder() + " ]");

		if (bean instanceof Worker) {
			Worker w = (Worker) bean;

			System.out.println("[BPP] worker name: " + w.getName());
			System.out.println("[BPP] worker age: " + w.getAge());

			w.setName("Lupita");
			w.setAge(43);
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {

		System.out.println("[Bean Post Processor After Initialization " + this.getOrder() + " ]");

		if (bean instanceof Worker) {
			Worker w = (Worker) bean;

			System.out.println("[BPP] worker name: " + w.getName());
			System.out.println("[BPP] worker age: " + w.getAge());

			w.setName("Antonio");
			w.setAge(23);
		}

		return bean;
	}

}
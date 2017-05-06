package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.api.IWorker;
import org.certificatic.spring.core.practica10.beanpostprocessors.bean.proxy.WorkerProxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor4 implements BeanPostProcessor, Ordered {

	@Override
	public int getOrder() {
		return 4;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {

		System.out.println("[Bean Post Processor Before Initialization " + this.getOrder() + " ]");

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {

		System.out.println("[Bean Post Processor After Initialization " + this.getOrder() + " ]");

		if (bean instanceof IWorker) {
			IWorker w = (IWorker) bean;

			WorkerProxy wp = new WorkerProxy();
			wp.setOriginalWorker(w);
			bean = wp;
		}

		return bean;
	}

}
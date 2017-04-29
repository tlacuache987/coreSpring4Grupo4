package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest1 {

	@Test
	public void holaMundoNoSpringTest() {
		log.info("holaMundoNoSpringTest -------------------------");

		String ruta = "spring/practica2/beans.xml";

		// Implementar IoC con BeanFactory
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(ruta));

		HolaMundo hola = (HolaMundo) factory.getBean("holaMundoBean");

		Assert.assertNotNull(hola);
		Assert.assertNull(hola.getMensaje());

		log.info("{}", hola);

		HolaMundo hola2 = (HolaMundo) factory.getBean("holaMundoBean2");

		Assert.assertNotNull(hola2);
		Assert.assertNotNull(hola2.getMensaje());

		log.info("{}", hola2);

		HolaMundo hola3 = (HolaMundo) factory.getBean("holaMundoBean3");

		Assert.assertNotNull(hola3);
		Assert.assertNotNull(hola3.getMensaje());

		log.info("{}", hola3);
	}
}

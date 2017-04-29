package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest3 {

	private static ApplicationContext applicationContext;

	// Instanciar ApplicationContext Antes de ejecutar la clase de test

	@BeforeClass
	public static void setUp2() {
		applicationContext = new ClassPathXmlApplicationContext("spring/practica2/beans.xml");
	}

	@Test
	public void holaMundoSpringTest2() {
		log.info("holaMundoSpringTest2 -------------------------");

		// Implementar IoC con ApplicationContext
		Assert.assertNotNull(applicationContext);

		HolaMundo hola = (HolaMundo) applicationContext.getBean("holaMundoBean");

		Assert.assertNotNull(hola);
		Assert.assertNull(hola.getMensaje());

		log.info("{}", hola);

		HolaMundo hola2 = (HolaMundo) applicationContext.getBean("holaMundoBean2");

		Assert.assertNotNull(hola2);
		Assert.assertNotNull(hola2.getMensaje());

		log.info("{}", hola2);

		HolaMundo hola3 = (HolaMundo) applicationContext.getBean("holaMundoBean3");

		Assert.assertNotNull(hola3);
		Assert.assertNotNull(hola3.getMensaje());

		log.info("{}", hola3);
	}
}

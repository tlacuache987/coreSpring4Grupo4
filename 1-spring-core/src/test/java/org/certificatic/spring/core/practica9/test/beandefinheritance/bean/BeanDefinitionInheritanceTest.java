package org.certificatic.spring.core.practica9.test.beandefinheritance.bean;

import org.certificatic.spring.core.practica9.beandefinitioninheritance.bean.ConnectionDataBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeanDefinitionInheritanceTest {

	@Test
	public void beanDefinitionInheritanceTest1() {

		log.info("beanDefinitionInheritanceTest1 -------------------");

		// Implementar
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica9/bean-def-inheritance-application-context.xml");

		ConnectionDataBase connexionProduccion = applicationContext.getBean("connectionProdBean",
				ConnectionDataBase.class);

		Assert.assertNotNull(connexionProduccion);

		connexionProduccion.showInfo();

		ConnectionDataBase connexionTest = applicationContext.getBean("connectionTestBean", ConnectionDataBase.class);

		Assert.assertNotNull(connexionTest);

		connexionTest.showInfo();

		applicationContext.close();
	}

	@Test
	public void beanDefinitionInheritanceTest2() {

		log.info("beanDefinitionInheritanceTest2 -------------------");

		// Implementar
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica9/bean-def-inheritance-application-context2.xml");

		ConnectionDataBase connexionProduccion = applicationContext.getBean("connectionProdBean",
				ConnectionDataBase.class);

		Assert.assertNotNull(connexionProduccion);

		connexionProduccion.showInfo();

		ConnectionDataBase connexionTest = applicationContext.getBean("connectionTestBean", ConnectionDataBase.class);

		Assert.assertNotNull(connexionTest);

		connexionTest.showInfo();

		applicationContext.close();
	}

}

package org.certificatic.spring.core.practica15.test.autowired.setter;

import org.certificatic.spring.core.practica15.autowired.setter.bean.Journalist;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutowiredSetterAnnotationTest {

	@Test
	public void autowiredSetterAnnotationTest() {

		log.info("autowiredSetterAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-autowired-setter-application-context.xml";

		// Implementar
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(ctxFile);
		
		Journalist journalist = context.getBean(Journalist.class);
		
		Assert.assertNotNull(journalist);
		Assert.assertNotNull(journalist.getName());
		Assert.assertNotNull(journalist.getAge());
		Assert.assertNotNull(journalist.getNotebook());
		Assert.assertNotNull(journalist.getPen());
		
		log.info("journalist: {}", journalist);
		
		context.close();
	}

}

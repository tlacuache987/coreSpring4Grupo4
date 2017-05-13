package org.certificatic.spring.core.practica15.test.autowired.properties;

import org.certificatic.spring.core.practica15.autowired.properties.bean.Reporter;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutowiredPropertiesAnnotationTest {

	@Test
	public void autowiredPropertiesAnnotationTest() {

		log.info("autowiredPropertiesAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-autowired-property-application-context.xml";

		// Implementar
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(ctxFile);

		Reporter reporter = context.getBean(Reporter.class);

		Assert.assertNotNull(reporter);
		Assert.assertNotNull(reporter.getName());
		Assert.assertNotNull(reporter.getAge());
		Assert.assertNotNull(reporter.getBooklet());
		Assert.assertNotNull(reporter.getPencil());

		Assert.assertNull(reporter.getDni());

		log.info("reporter: {}", reporter);

		context.close();
	}

}

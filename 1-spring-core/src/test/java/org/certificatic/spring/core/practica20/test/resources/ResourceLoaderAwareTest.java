package org.certificatic.spring.core.practica20.test.resources;

import org.certificatic.spring.core.practica20.resources.bean.BeanResourceLoaderAware;
import org.certificatic.spring.core.practica20.test.resources.utils.ResourcesTestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Implementar run with spring-test
@RunWith(SpringJUnit4ClassRunner.class)
// cargar context configuration
@ContextConfiguration(locations = { ResourceLoaderAwareTest.location })
public class ResourceLoaderAwareTest {

	public static final String location = "classpath:/spring/practica20/resources-application-context.xml";

	// Inyectar
	@Autowired
	private BeanResourceLoaderAware beanResourceLoaderAware;

	@Test
	public void loadTextFileResourceLoaderAwareTest() {

		log.info("loadTextFileResourceLoaderAwareTest -------------------");

		// loadTextFile
		String location = "file:/Users/xvhx/certificatic-resources/my-text-file.txt";
		ResourcesTestUtils.loadTextFile(beanResourceLoaderAware.getResourceLoader().getResource(location));
	}

	@Test
	public void loadPropertiesResourceLoaderAwareTest() {

		log.info("loadPropertiesResourceLoaderAwareTest -------------------");

		// loadPropertiesFile
		String location = "spring/practica20/my-properties.properties";
		ResourcesTestUtils.loadPropertiesFile(beanResourceLoaderAware.getResourceLoader().getResource(location));
	}

	@Test
	public void loadUrlFileResourceLoaderAwareTest() {

		log.info("loadUrlFileResourceLoaderAwareTest -------------------");

		// loadURLFile
		String location = "http://spring.io/";
		ResourcesTestUtils.loadURLFile(beanResourceLoaderAware.getResourceLoader().getResource(location));
	}

	@Test
	public void loadAndCopyImageResourceLoaderAwareTest() {

		log.info("loadAndCopyImageResourceLoaderAwareTest -------------------");

		// loadAndCopyImage
		String location = "file:src/main/resources/spring/practica20/logo.png";
		String copyPath = "src/main/resources/spring/practica20/copy-resource-loader-aware/";
		ResourcesTestUtils.loadAndCopyImage(beanResourceLoaderAware.getResourceLoader().getResource(location),
				copyPath);
	}
}

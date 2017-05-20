package org.certificatic.spring.core.practica19.javaconfig;

import org.certificatic.spring.core.practica19.javaconfig.bean.DummyRepository;
import org.certificatic.spring.core.practica19.javaconfig.bean.DummyService;
import org.certificatic.spring.core.practica19.javaconfig.bean.api.IQuadraticEquationService;
import org.certificatic.spring.core.practica19.javaconfig.bean.api.impl.QuadraticEquationServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Habilitar Clase de configuracion
@Configuration
public class ServiceConfig {

	// Define Bean
	@Bean
	public DummyService dummyService(@Qualifier("dummyRepository") DummyRepository dummyRespository) {
		return new DummyService(dummyRespository);
	}

	// Define Bean
	@Bean
	public DummyService dummyService2(@Qualifier("dummyRepository2") DummyRepository dummyRespository) {
		return new DummyService(dummyRespository);
	}

	@Bean
	public IQuadraticEquationService quadraticService() {
		return new QuadraticEquationServiceImpl();
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Qualifier("quadraticEquationServiceBean")
	public IQuadraticEquationService quadraticService2() {
		return new QuadraticEquationServiceImpl();
	}

	@Bean
	@Scope("prototype")
	public IQuadraticEquationService quadraticService3() {
		return new QuadraticEquationServiceImpl();
	}
}

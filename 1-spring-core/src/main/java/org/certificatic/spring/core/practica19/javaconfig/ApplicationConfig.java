package org.certificatic.spring.core.practica19.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// Habilitar Clase de configuracion
@Configuration
// Habilitar component scan
@ComponentScan(basePackages = { "org.certificatic.spring.core.practica19" })
// Agregar Import de clases de configuracion Repository y Service
@Import({ RepositoryConfig.class, ServiceConfig.class })
public class ApplicationConfig {

}

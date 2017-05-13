package org.certificatic.spring.core.practica17.stereotypes.api.restcontrollers.impl;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IRestControllerClass;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
// Anotar rest controlador, implementar Interface IRestControllerClass
@RestController
public class RestControllerClassImpl1 implements IRestControllerClass {

	// Inyectar con "resource" bean restControllerClassName
	@Resource
	private String restControllerClassName;
}

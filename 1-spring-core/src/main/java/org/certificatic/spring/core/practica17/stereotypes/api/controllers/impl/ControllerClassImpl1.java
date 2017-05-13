package org.certificatic.spring.core.practica17.stereotypes.api.controllers.impl;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IControllerClass;
import org.springframework.stereotype.Controller;

import lombok.Data;

@Data
// Anotar controlador, implementar Interface IControllerClass
@Controller
public class ControllerClassImpl1 implements IControllerClass {

	// Inyectar con "resource" bean controllerClassName
	@Resource
	private String controllerClassName;
}

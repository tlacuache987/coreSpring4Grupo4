package org.certificatic.spring.core.practica17.stereotypes.api.components.impl;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IComponentClass;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
// Anotar componente, implementar Interface IComponentClass
@Component
public class ComponentClassImpl1 implements IComponentClass {

	// Inyectar con "resource" bean componentClassName
	@Resource
	private String componentClassName;
}

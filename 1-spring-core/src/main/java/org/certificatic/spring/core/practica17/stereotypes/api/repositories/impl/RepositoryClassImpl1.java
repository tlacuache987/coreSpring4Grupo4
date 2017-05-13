package org.certificatic.spring.core.practica17.stereotypes.api.repositories.impl;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IRepositoryClass;
import org.springframework.stereotype.Repository;

import lombok.Data;

@Data
// Anotar repositorio, implementar Interface IRepositoryClass
@Repository
public class RepositoryClassImpl1 implements IRepositoryClass{

	// Inyectar con "resource" bean repositoryClassName
	@Resource
	private String repositoryClassName;
}

package org.certificatic.spring.core.practica18.jsr330.bean.secretaries;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.inject.Singleton;

import org.certificatic.spring.core.practica18.jsr330.bean.Employee;
import org.certificatic.spring.core.practica18.jsr330.bean.Secretary;
import org.certificatic.spring.core.practica18.jsr330.qualifiers.SecretaryAssistantQualifier;

@Named
@Singleton
@SecretaryAssistantQualifier
public class SecretaryAssistant extends Secretary {

	@Override
	@Resource(name = "secretaryAssistantEmployee")
	// @Inject
	// @SecretaryAssistantQualifier
	public void setEmployee(Employee employee) {
		super.setEmployee(employee);
	}

}

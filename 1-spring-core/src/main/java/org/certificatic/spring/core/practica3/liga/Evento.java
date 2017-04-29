package org.certificatic.spring.core.practica3.liga;

import lombok.Data;

@Data
public class Evento {

	private String nombre;

	public void saludar() {
		System.out.println("Hola soy el Evento");
		System.out.println("me llamo: " + nombre + " " + ubicacionEnMemoria());
	}

	private String ubicacionEnMemoria() {
		return Integer.toHexString(super.hashCode());
	}
}

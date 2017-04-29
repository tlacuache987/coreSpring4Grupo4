package org.certificatic.spring.core.practica3.liga;

import lombok.Data;

@Data
public class Torneo {

	private String nombre;
	private Evento evento;

	public void saludar() {
		System.out.println("Hola soy el Torneo");
		System.out.println("me llamo: " + nombre + " " + ubicacionEnMemoria());
	}

	private String ubicacionEnMemoria() {
		return Integer.toHexString(super.hashCode());
	}
}

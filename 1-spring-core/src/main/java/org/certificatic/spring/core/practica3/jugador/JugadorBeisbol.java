package org.certificatic.spring.core.practica3.jugador;

import org.certificatic.spring.core.practica3.jugador.api.IJugador;
import org.certificatic.spring.core.practica3.liga.Partido;
import org.certificatic.spring.core.practica3.liga.Torneo;

import lombok.Data;

@Data
public class JugadorBeisbol implements IJugador{
	private String nombre;
	private Torneo torneo;
	private Partido partido;

	public void saludar() {
		System.out.println("Hola soy un jugador de Besibol");
		System.out.println("me llamo: " + nombre + " " + ubicacionEnMemoria());
	}

	private String ubicacionEnMemoria() {
		return Integer.toHexString(super.hashCode());
	}

}

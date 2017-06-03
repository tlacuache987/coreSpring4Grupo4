package org.certificatic.spring.aop.practica22.xmlconfig.bean.api.impl;

import org.certificatic.spring.aop.practica22.xmlconfig.bean.api.IJugador;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("jugadorBean")
public class Jugador implements IJugador {

	@Value("Ivan Garcia")
	private String nombre;

	@Value("11")
	private String numero;

	@Override
	public void ejecutarPase() {
		print(this.getDatosJugador() + " pasa el balon.");
	}

	@Override
	public void cometerFalta() {
		print(this.getDatosJugador() + " cometio una falta.");
	}

	@Override
	public void esExpulsado() {
		print(this.getDatosJugador() + " es expulsado.");
	}

	@Override
	public void tirarAGol(boolean gol) throws Throwable {
		print(this.getDatosJugador() + " se prepara para tirar a gol.");

		if (gol) {
			print(this.getDatosJugador() + " anoto un gol.");
		} else {
			throw new Exception(this.getDatosJugador() + " fallo un tiro a gol.");
		}

		return;
	}

	@Override
	public void cobrarPenal(boolean gol) throws Throwable {
		print(this.getDatosJugador() + " se prepara para cobrar un penal.");

		if (gol) {
			print(this.getDatosJugador() + " anoto un gol de penal.");
		} else {
			throw new Exception(this.getDatosJugador() + " fallo un tiro de penal.");
		}

		return;
	}

	private String getDatosJugador() {
		return "[jugador] El jugador: " + this.nombre + " [" + this.numero + "]";
	}

	private void print(String mensaje) {
		log.info("{}", mensaje);
	}

}

package org.certificatic.spring.aop.practica23.test.aspectjconfig;

import org.certificatic.spring.aop.practica23.aspectjconfig.SpringAspectJAopConfig;
import org.certificatic.spring.aop.practica23.aspectjconfig.bean.api.IAdivinador;
import org.certificatic.spring.aop.practica23.aspectjconfig.bean.api.IVoluntario;
import org.certificatic.spring.aop.practica23.aspectjconfig.bean.api.impl.Mago;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringAspectJAopConfig.class })
public class MagoSpringAopAspectJTest {

	// Inyectar
	@Autowired
	private IVoluntario voluntario;

	//@Autowired
	//private IAdivinador adivinador;

	// Inyectar
	public void setUp() {
		Assert.assertNotNull(voluntario);
	}

	/*
	@Test
	public void test() throws Throwable{
		String p = "coca-cola";
		adivinador.interceptarPensamiento(null, p);
		voluntario.pensarEnAlgo(p);
		
		boolean hacerTrampa = true;
		
		String pensamiento = null;
		
		pensamiento = hacerTrampa ? (String) ((Mago)adivinador).hacerMagia(null, hacerTrampa) : voluntario.getPensamiento(hacerTrampa);
		
		Assert.assertEquals("No me he bañado en 5 dias", pensamiento);
		log.info("pensamiento: {}", pensamiento);
	}*/

	@Test
	public void magoSpringAopAspectJTest() {

		log.info("magoSpringAopAspectJTest -------------------");

		boolean joke = false;

		voluntario.pensarEnAlgo("coca-cola");

		String pensamiento = voluntario.getPensamiento(joke);

		String expectedPensamiento = "coca-cola"; // Cual es el pensamiento esperado?

		Assert.assertEquals(expectedPensamiento, pensamiento);

		log.info("pensamiento: {}", pensamiento);
		log.info("expectedPensamiento: {}", expectedPensamiento);
	}

	@Test
	public void magoSpringAopAspectJWithJokeTest() {

		log.info("magoSpringAopAspectJWithJokeTest -------------------");

		boolean joke = true;

		voluntario.pensarEnAlgo("coca-cola");

		String pensamiento = voluntario.getPensamiento(joke);

		String expectedPensamiento = "No me he bañado en 5 dias"; // Cual es el pensamiento esperado?

		Assert.assertEquals(expectedPensamiento, pensamiento);

		log.info("pensamiento: {}", pensamiento);
		log.info("expectedPensamiento: {}", expectedPensamiento);
	}

}

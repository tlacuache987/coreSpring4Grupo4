package org.certificatic.practica1.interfaces.livingbeing.test;

import org.certificatic.practica1.interfaces.livingbeing.api.BugEater;
import org.certificatic.practica1.interfaces.livingbeing.api.LivingBeing;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.Aardvark;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.Animal;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.Plant;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.VenusFlyTrap;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LivingBeingTest {

	@Test
	public void livingBeingTest() {
		log.info("livingBeingTest -------------------");

		LivingBeing livingBeing1 = new VenusFlyTrap("Pancho");
		LivingBeing livingBeing2 = new Aardvark("Juancho");

		log.info("Living Being 1: {}", livingBeing1);
		log.info("Living Being 2: {}", livingBeing2);
		
		Assert.assertTrue(livingBeing1 instanceof VenusFlyTrap);
		Assert.assertTrue(livingBeing1 instanceof Plant);
		Assert.assertTrue(livingBeing1 instanceof BugEater);
		
		Assert.assertTrue(livingBeing2 instanceof Aardvark);
		Assert.assertTrue(livingBeing2 instanceof Animal);
		Assert.assertTrue(livingBeing2 instanceof BugEater);
		
		((BugEater)livingBeing1).eatBug();
		((BugEater)livingBeing2).eatBug();
	}

}

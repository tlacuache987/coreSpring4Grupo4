package org.certificatic.practica1.interfaces.operations.test;

import java.text.DecimalFormat;

import org.certificatic.practica1.interfaces.operations.api.IKidsCalculator;
import org.certificatic.practica1.interfaces.operations.api.impl.KidsCalculator;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KidsCalculatorTest {

	private DecimalFormat df = new DecimalFormat("#.00##");

	@Test
	public void kidsCalculatorTest() {
		log.info("kidsCalculatorTest -------------------");

		// Implementar
		IKidsCalculator<KidsCalculator> k = new KidsCalculator();

		double resultExpected = 8;

		double result = k.set(5).add(5).substract(2).result();

		Assert.assertEquals(resultExpected, result, 0.0001);
	}

}

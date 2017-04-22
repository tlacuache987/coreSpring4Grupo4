package org.certificatic.practica1.interfaces.operations.api.impl;

import org.certificatic.practica1.interfaces.operations.api.IKidsCalculator;

public class KidsCalculator2 extends Calculator<KidsCalculator2> implements IKidsCalculator<KidsCalculator2> {

	@Override
	public KidsCalculator2 substract(double number) {
		this.setAccumulator(this.getAccumulator() - number + 1);
		return this;
	}

	@Override
	public KidsCalculator2 add(double number) {
		this.setAccumulator(this.getAccumulator() + number);
		return this;
	}

}
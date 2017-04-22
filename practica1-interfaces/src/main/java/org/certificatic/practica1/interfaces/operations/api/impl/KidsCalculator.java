package org.certificatic.practica1.interfaces.operations.api.impl;

import org.certificatic.practica1.interfaces.operations.api.IKidsCalculator;

public class KidsCalculator extends Calculator<KidsCalculator> 
	implements IKidsCalculator<KidsCalculator> {

	@Override
	public KidsCalculator substract(double number) {
		this.setAccumulator(this.getAccumulator() - number);
		return this;
	}

	@Override
	public KidsCalculator add(double number) {
		this.setAccumulator(this.getAccumulator() + number);
		return this;
	}

}
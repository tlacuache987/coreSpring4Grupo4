package org.certificatic.practica1.interfaces.operations.api.impl;

import org.certificatic.practica1.interfaces.operations.api.ICalculator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public abstract class Calculator<K> implements ICalculator<K>{
	
	@Getter(AccessLevel.PROTECTED) @Setter(AccessLevel.PROTECTED)
	private double accumulator;

	@Override
	public K set(double number) {
		this.accumulator = number;
		return (K) this;
	}

	@Override
	public double result() {
		return accumulator;
	}

}
// method chaining
// c.set(4).add(3).add(4).add(5).divide(34).result();
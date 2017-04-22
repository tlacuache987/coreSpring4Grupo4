package org.certificatic.practica1.interfaces.livingbeing.api.impl;

import org.certificatic.practica1.interfaces.livingbeing.api.BugEater;

public class VenusFlyTrap extends Plant implements BugEater{
	
	public VenusFlyTrap(String subType) {
		this.setSubType(subType);
	}

	@Override
	public void born() {
		System.out.println("born like a " + this.getType() + 
				" (" + this.getSubType() + ")");
	}

	@Override
	public void grow() {
		System.out.println("grow like a " + this.getType() + 
				" (" + this.getSubType() + ")");
	}

	@Override
	public void breed() {
		System.out.println("breed like a " + this.getType() + 
				" (" + this.getSubType() + ")");
	}

	@Override
	public void die() {
		System.out.println("die like a " + this.getType() + 
				" (" + this.getSubType() + ")");
	}

	@Override
	public void eatBug() {
		System.out.println("eat bug like a " + this.getType() + 
				" (" + this.getSubType() + ")");
	}
}

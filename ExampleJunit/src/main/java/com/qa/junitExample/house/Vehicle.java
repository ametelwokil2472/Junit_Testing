package com.qa.junitExample.house;

public abstract class Vehicle {
	protected String model;
protected double milage;
public Vehicle(String model, double milage) {
	super();
	this.model = model;
	this.milage = milage;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getMilage() {
	return milage;
}
public void setMilage(double milage) {
	this.milage = milage;
}




}

package com.qa.junitExample.house;

import java.util.ArrayList;

public class House {

protected Door frontDoor;
protected ArrayList<Window> propertyWindow;
//	lights
//	chimeny
//	rooms
 protected String address;
 protected Garage attacheGarage;
//	garage
//	
	public House() {
		super();
	
	}
public House(Door frontDoor, ArrayList<Window> propertyWindow, String address, Garage attacheGarage) {
	super();
	this.frontDoor = frontDoor;
	this.propertyWindow = propertyWindow;
	this.address = address;
	this.attacheGarage = attacheGarage;
}
	
}

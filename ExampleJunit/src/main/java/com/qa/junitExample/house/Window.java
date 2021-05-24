package com.qa.junitExample.house;

public class Window {
protected boolean isOpen;


public Window() {
	super();
	this.isOpen = false;
}

public Window(boolean isOpen) {
	super();
	this.isOpen = isOpen;
}
public boolean openDoor() {
	return isOpen = true;
}
public boolean closeDoor() {
	return isOpen = false;
}
////public boolean closeDoor() {
//	return isOpen;
//}
}

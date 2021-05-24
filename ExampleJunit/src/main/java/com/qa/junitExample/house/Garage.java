package com.qa.junitExample.house;

import java.util.ArrayList;
import java.util.List;

public class Garage {
protected List<Vehicle>contents;
protected Door mainShutter;

public Garage() {
	super();
	contents = new ArrayList<Vehicle>();
}





public void addVehicles(Vehicle vehcle) {
	contents.add(vehcle);
}
public void setVehicles(Vehicle vehcle) {
	contents.set(0, vehcle);
}

}

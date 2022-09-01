package ch08.book.s080506;

import ch08.book.s080504.Vehicle;
import ch08.book.s080505.Bus;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {			
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		}
		
		vehicle.run();
	}
}

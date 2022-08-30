package ch07.book.s070402;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERDONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();
	}
}

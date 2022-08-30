package ch07.book.s070402;

public class SupersonicAirplane extends Airplane{
	public static final int NOMAL = 1;
	public static final int SUPERDONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERDONIC) {
			System.out.println("초음속 비행합니다");
		}else {
			super.fly();			
		}
	}
}

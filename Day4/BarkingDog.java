
public class BarkingDog {

	public static void main(String[] args) {
		
		boolean result = false;
		result = shouldWakeUp(true, 1);
		System.out.println(result);
		result = shouldWakeUp(false, 2);
		System.out.println(result);
		result = shouldWakeUp(true, 8);
		System.out.println(result);
		result = shouldWakeUp(true, -1);
		System.out.println(result);

	}
	
	
	public static boolean shouldWakeUp (boolean barking, int hourOfDay) {	
		if ( hourOfDay >=0 && hourOfDay <=23 ) {
			if (hourOfDay < 8 || hourOfDay > 22) {
				if (!barking) {
					return false;
				} else return true;
			} else return false;
		} else {
			return false;
		}

	
		
	}
	
	
	
	
	

}


public class LongOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lightspeed = 1860000;
		long days;
		long seconds = 0;
		long distance;
		days = 1000;
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;
		System.out.println("In " + days);
		System.out.println(" days light will travel about ");
		System.out.println(distance + " miles. ");
		

	}

}

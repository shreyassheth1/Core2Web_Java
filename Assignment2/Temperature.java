public class Temperature {
	public static void main(String args[]) {
		double fahrenheit = 62.5;

		double celsius = f2c(fahrenheit);
		System.out.println(fahrenheit + "F = " + celsius + "C");
	}

static double f2c(double fahr) {
	
	return(fahr - 32.0) * 5.0 / 9.0;
	}
}

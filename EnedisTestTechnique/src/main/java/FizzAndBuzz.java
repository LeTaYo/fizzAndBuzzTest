
public class FizzAndBuzz {
	
	public static String dividibleBy(int number) {
		if (number % 15 == 0) return "fizzbuzz";
		else if (number % 5 == 0) return "buzz";
		return Integer.toString(number); 
	}
}

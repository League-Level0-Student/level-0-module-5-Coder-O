package _01_algorithms._2_fibonacci;

public class _2_fibonacci_code {
	
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		System.out.println("1");
		for(int i = 0; i < 12; i++) {
			sum = number1 + number2;
			System.out.println(sum);
			number1 = number2;
			number2 = sum;
			
		}
		
		
	}
	
}

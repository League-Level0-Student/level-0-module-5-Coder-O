package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class _1_prime_or_not_code {

	public static void main(String[] args) {
		
		boolean finish = false;
		int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number that you want to see if it is prime. Please only enter a number, with no extra charecters."));
		for(int i = 2; finish == false; i++) {
			if(number%i == 0) {
				JOptionPane.showMessageDialog(null, "It is not prime.");
				finish = true;
				System.out.println(i);
			}
			if (i*i>number) {
				finish = true;
				JOptionPane.showMessageDialog(null, "It is prime.");
				System.out.println(i);
			}
		}
		

	}

}

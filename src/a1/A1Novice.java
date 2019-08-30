package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nameList = scan.nextInt();
		String [] output = new String [nameList];
		for (int i=0; i<output.length; i++) {
			double total = 0;
			String firstName = scan.next();
			char firstInitial = firstName.charAt(0);
			String lastName = scan.next();
			int bought = scan.nextInt();
			for (int a=0; a<bought; a++) {
				int numberOf = scan.nextInt();
				String product = scan.next();
				double price = scan.nextDouble();
				for (int b=0; b<numberOf; b++) {
					total += price;
					
				}
			}
			
			String total2 = String.format("%.2f", total);
			System.out.println(firstInitial + ". " + lastName + ": " + total2);
		}
		
	}
}

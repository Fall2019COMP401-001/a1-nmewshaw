package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		String [] itemName = new String [itemCount];
		double [] itemPrice = new double [itemCount];
		for (int i=0; i<itemName.length; i++) {
			itemName[i] = scan.next();
		    itemPrice[i] = scan.nextDouble();
		}
		int customerCount = scan.nextInt();
		String [] firstName = new String [customerCount];
		String [] lastName = new String [customerCount];
		double [] spent = new double [customerCount];
		
		for (int a=0; a<firstName.length; a++) {
			firstName[a] = scan.next();
			lastName[a] = scan.next();
			int productsBought = scan.nextInt();
			String [] itemBought= new String [productsBought];
			int [] itemNumber = new int [productsBought];
			for (int b = 0; b<productsBought; b++) {
				itemNumber[b] = scan.nextInt();
				itemBought[b] = scan.next();
			}
			
			for (int c = 0; c<productsBought; c++) {
				for (int d = 0; d<itemName.length; d++) {
				        if (itemBought[c].equals(itemName[d])) {
						spent[a] += itemPrice[d] * itemNumber[c];
				}
			    }
				
			      }
			double biggestAmount = spent[0];
			double smallestAmount = spent[0];
			String biggestFirst = firstName[0];
			String biggestLast = lastName[0];
			String smallestFirst = firstName[0];
			String smallestLast = lastName[0];
			double average = 0;
			int count = 0;
			for (int e = 0; e<spent.length; e++) {
				if (spent[e] >= biggestAmount) {
					biggestAmount = spent[e];
					biggestFirst = firstName[e];
					biggestLast = lastName[e];
					average += spent[e];
					count++;
				} else if (spent[e] < smallestAmount) {
					smallestAmount = spent[e];
					smallestFirst = firstName[e];
					smallestLast = lastName[e];
					average += spent[e];
					count++;
				} else {
					average += spent[e];
					count++;
				}
				
			} 
			average = average / count;
			String average2 = String.format("%.2f", average);
			String biggestAmount2 = String.format("%.2f", biggestAmount);
			String smallestAmount2 = String.format("%.2f", smallestAmount);
			System.out.println("Biggest: " + biggestFirst + " " + biggestLast + " ("
					+ biggestAmount2 + ") " + "Smallest: " + smallestFirst + " " + 
					smallestLast + " (" + smallestAmount2 + ") Average: " + average2);
		}
		
	}
}


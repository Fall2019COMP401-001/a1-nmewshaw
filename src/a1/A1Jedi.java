package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int printer = 0;
		int itemCount = scan.nextInt();
		String [] itemName = new String [itemCount];
		int [] ifBought = new int [itemCount];
		int [] boughtCount = new int [itemCount];
		double [] itemPrice = new double [itemCount];
		for (int i=0; i<itemName.length; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		int customerCount = scan.nextInt();
		
		for (int a=0; a<customerCount; a++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numOfProductsBought = scan.nextInt();
			String [] itemBought= new String [numOfProductsBought];
			int [] itemNumber = new int [numOfProductsBought];
			for (int b = 0; b<numOfProductsBought; b++) {
				itemNumber[b] = scan.nextInt();
				itemBought[b] = scan.next();
			}
			for (int c = 0; c<numOfProductsBought; c++) {
				for (int d = 0; d<itemCount; d++) {
					 boolean niceTry = false;
					if (itemBought[c].equals(itemName[d]) && niceTry == true) {
						boughtCount[d] += itemNumber[c];
					}
						else if (itemBought[c].equals(itemName[d])) {
						ifBought[d]++;
						boughtCount[d] += itemNumber[c];
						niceTry = true;
						
			
				}
			    }
				
			      }
			printer++;
			if (printer == customerCount) {
				for(int g=0; g<itemCount; g++) {
					if (ifBought[g] > 0) {
						System.out.println(ifBought[g] + " customers bought " + 
					boughtCount[g] + " " + itemName[g]);
					} else {
						System.out.println("No customers bought" + " " + itemName[g]);
					}
					
				} 
				
			}
		
	}
}
}


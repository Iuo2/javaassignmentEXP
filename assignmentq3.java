import java.util.Scanner;
public class assignmentq3 {

	public static void main(String[] args) {
		
		double discount = 0;
				
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please input the amount purchased.");
		double purchasedAmount = scanner.nextDouble();
		
		System.out.println("Please enter member type: "
				+ "\n1. for Regular customer."
				+ "\n2. for Premium customer.");
		int memberType = (char) scanner.nextInt();
	
		switch(memberType) {
		
		case 1 :
			if(purchasedAmount < 100) {
				discount = 0 ;
			}
			else if(purchasedAmount >= 100 && purchasedAmount <=500) {
					discount = 0.05 ;
			}
			else if(purchasedAmount > 500) {
					discount = 0.10;
			}
			else {
				System.out.println("Error value.");
			}
			break;
			
		case 2 :
			if(purchasedAmount < 100) {
				discount = 0.02;
			}
			else if(purchasedAmount >= 150 && purchasedAmount <= 650) {
				discount = 0.07;
			}
			else if(purchasedAmount > 650) {
				discount = 0.15;
			}
			else {
				System.out.println("Error value.");
			}
			break;
			
			default :
				System.out.println("This member type does not exist.");
				}
			if(purchasedAmount >=0) {
				if(memberType >= 1 & memberType <=2) {
					purchasedAmount = purchasedAmount - purchasedAmount*discount;
					System.out.println("Customer's discount is " + (discount*100) + "% and the amount needed to pay is " + String.format("%.2f", purchasedAmount));
				}
			}
		scanner.close();
	}
}

		

		
		



		
		
		
		
		
		

	



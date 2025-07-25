import javax.swing.JOptionPane;
public class assignmentQ1 {

	public static void main(String[] args) {
			
		double regularCoffee = 5.50;
		double cappuccino = 7.49 ;
		double latte = 8.00 ;
		double whippedCream = 1.25 ;
		double chocolateSyrup = 2.00 ;
		
		JOptionPane.showMessageDialog(null, "Coffee shop menu: "
				+ "\n1. Regular Coffee : $" + regularCoffee
				+ "\n2. Cappuccino: $" + cappuccino 
				+ "\n3. Latte: $" + latte );
		
		String inputString = JOptionPane.showInputDialog("Please enter your choice");
		
		JOptionPane.showMessageDialog(null, "Do you want to add extra items?"
				+ "\n1. Whipped Cream : $" + whippedCream
				+ "\n2. Chocolate Syrup: $" + chocolateSyrup
				+ "\n3. No extra items.");
		
		String inputString2 = JOptionPane.showInputDialog("Please enter your choice");
		
		double total = 0;
		
		switch (inputString) {
	
		case "1" :
			total = regularCoffee;
			break;
			
		case "2" :
			total = cappuccino;
			break;
			
		case "3" :
			total = latte;
			break;
			
		}
		
		double finalTotal = 0;
		
		switch(inputString2) {
		
		case "1" :
			finalTotal = total + whippedCream;
			break;
			
		case "2" :
			finalTotal = total + chocolateSyrup;
			break;
			
		case "3" :
			finalTotal = total;
			break;
			
		}
		
		JOptionPane.showMessageDialog(null, "Your total is :$ " + finalTotal);

	}
	}


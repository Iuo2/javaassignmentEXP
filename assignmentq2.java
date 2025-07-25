import java.util.Scanner;
public class assignmentq2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name:"); 
		String name = scanner.next();
		
		System.out.println("Please enter your time: ");
		double time = scanner.nextDouble();
		
		System.out.println("Please enter your name: ");
		String name2 = scanner.next();
		
		System.out.println("Please enter your time: ");
		double time2 = scanner.nextDouble();
		
		System.out.println("Please enter your name: ");
		String name3 = scanner.next();
		
		System.out.println("Please enter your time: ");
		double time3 = scanner.nextDouble();
		
		if (time < time2 && time2 < time3) // 123done 132done 213done 231done 321 312done
			System.out.println("The results are: "
					+ "\n1st. " + name  +" with the time of "+ time 
					+ "\n2nd. " + name2 +" with the time of "+ time2
					+ "\n3rd. " + name3 +" with the time of "+ time3 );
					
			else if (time < time3 && time3 < time2)
			System.out.println("The results are:"
					+ "\n1st. "+ name  +" with the time of"+ time
					+ "\n2nd. "+ name3 +" with the time of"+ time3
					+ "\n3rd. "+ name2 +" with the time of"+ time2);
			
					else if (time2 < time && time < time3)
						System.out.println("The results are: "
				+ "\n1st. " + name2 +" with the time of "+ time2 
				+ "\n2nd. " + name  +" with the time of "+ time
				+ "\n3rd. " + name3 +" with the time of "+ time3 );
		    
					else if (time2 < time3 && time3 < time)
						System.out.println("The results are: "
								+ "\n1st. "+ name2 +" with the time of "+ time2
								+ "\n2nd. "+ name3 +" with the time of "+ time3
								+ "\n3rd. "+ name  +" with the time of "+ time);
						
		    		else if (time3 < time && time < time2)
		    			System.out.println("The results are: "
		    					+ "\n1st. " + name3  +" with the time of "+ time3 
		    					+ "\n2nd. " + name +" with the time of "+ time
		    					+ "\n3rd. " + name2 +" with the time of "+ time2 );
		    		
		    		else if (time3 < time2 && time2 < time)
		    			System.out.println("The results are:"
		    					+ "\n1st. "+ name3 +" with the time of "+ time3
		    					+ "\n2nd. "+ name2 +" with the time of "+ time2
		    					+ "\n3rd. "+ name  +" with the time of "+ time);
			
			scanner.close();
			}
	
	}



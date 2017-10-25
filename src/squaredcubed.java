import java.lang.Math;
import java.util.Scanner; 


public class squaredcubed {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		//1. Prompt user for integer input
		while (choice.equalsIgnoreCase("Y")) 
		{

			int userInput = 0;
			System.out.println("Enter an integer:");
		
			userInput = scan.nextInt(); 
	
		//2. Calculate squares and cubes
	    
		
			
		System.out.println("Number"  + "   		"+ "Squared"   + "			"+ "Cubed");
		System.out.println("======"  + "   		"+ "========"   +"		" + "=====");
		
		//start for loop
		for (int i = 1; i <= userInput; i++) {
			
		
		
		int userSquared = i * i;
		int userCubed = getCubes(i);
	    
	    //3.  Display a table of squares and cubes
		
		
		System.out.println(i + "			" + userSquared + "			" + userCubed);	
		
		}
		//4.  Prompt user to continue
		scan.nextLine();
		System.out.println("");
		System.out.println("Do you want to continue? (Y/N)");
		choice = scan.nextLine();
		
		
		}
		scan.close();
		System.out.println("Goodbye!");
		

	}
		public static int getCubes(int input) {
			
		    int result = (int) Math.pow(input, 3);
			
			return result;  
			
		}
}

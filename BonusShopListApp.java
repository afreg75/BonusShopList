import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class BonusShopListApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		int[] lineNum = {1, 2, 3, 4, 5, 6, 7, 8};
		Double[] price = {26.00, 25.00, 23.00, 19.95, 34.50, 12.34, 32.00, 12.00};
		String[] inventory = {"Alternator", "Starter", "Bearing", "Matts", "Alarm", "Camshaft", "Headlight", "Antifreeze"};
		
		System.out.println("Here is a list a parts we have in stock.");
		
		System.out.println();
				
			for(int i =0 ; i < inventory.length; i++) {
				System.out.println(lineNum[i] + " " + inventory[i] + " " + price[i]);
			   	}
			
			System.out.println();
			
			System.out.println("Please enter name of the part you want to order");
			String userContinue = scnr.next();
			
			//This is where you need to start the Collection of Data
			
	}
			   	    	    			
    

       public static int getInt1(String prompt, Scanner scnr) {
        boolean isValid = false;
        int num = 0;

        do {
			
        	num = scnr.nextInt();
        	
        	if (num < 1) {
				isValid = false;
				System.out.println("The number must be between 1-8");
			} else if (num > 8) {
				isValid = false;
				System.out.println("The number must be between 1-8");
			} else {
				isValid = true;
			}
		} while (!isValid);
        
		return num;
    }
    
}
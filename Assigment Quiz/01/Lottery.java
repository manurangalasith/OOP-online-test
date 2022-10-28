package Paper_01;

import java.lang.Math;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int lotteryNumbers[] = new int[5];
		int userArray[] = new int[5];
		
		int max = 9;
	    int min = 0;
	    int range = max - min + 1;
	    int count = 0;
	    
	    
	    for(int i = 0 ; i<5 ; i++) {
	    	
	    	lotteryNumbers[i] = (int)(Math.random() * range) + min;
	    }
	    
	    
	    
	    for(int i = 0 ; i<5 ; i++) {
	    	
	    	System.out.print("Enter Lottry number " + (i+1) + " : ");
	    	userArray[i] = scn.nextInt();
	    }
	    
	    //display Randomly randomly lottery 
	    for(int i = 0 ; i<5 ; i++) {
	    	
	    	System.out.print(lotteryNumbers[i] + "\t");
	    	
	    }
	    
	    
	    
	    System.out.println("");

	    for (int i = 0; i < lotteryNumbers.length ; i++) {
	    	
	        for (int k = 0; k < userArray.length ; k++) {
	            if (lotteryNumbers[i] == userArray[k]) {
	            	
	            	System.out.println("Element" + (i+1) + " of lottry , matched with Element " +(k+1) + "of User lottry" );
	            	count = count+1;
	            }
		        	 	                
	        }
	        
	    }
	    
	    System.out.println("------------------------------------" );
	    System.out.println("Number of Matched Elements : " + count);
	    System.out.println("------------------------------------" );

	}

}

import java.util.Scanner;

public class CharArray {
	
	static int arrSize = 5;
	private char [] myCharArray;
	
	
	public CharArray(char myCharArray[]) {
		
		this.myCharArray = myCharArray ;
		
	}
	
	public void swapFirstAndLast() {
		
		char temp = myCharArray[0];
		this.myCharArray[0] = myCharArray[myCharArray.length-1];
		myCharArray[myCharArray.length-1] = temp;
	}
	
	public void DisplayArray () {
		
		for(int i = 0 ; i<arrSize ; i++) {
			System.out.println(this.myCharArray[i]);
		}
	}
	
	public void DispalyString(){
		
		for(int i = 0 ; i<arrSize ; i++) {
			
			System.out.print(this.myCharArray[i]);
		}
	}
	
	
	public static void main(String args[]){
		
		//Harded Coaded Array 
		char[] JavaCharArray1 = {'r', 's', 't', 'u', 'v'};
		
		//Geting Input for array
		
		/*
		char[] JavaCharArray2 = null  ;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Array Size : ");
		arrSize = scn.nextInt();
		
		System.out.println("Enter Array Elements ");
		for(int i = 0 ; i < arrSize ; i++) {
			
			JavaCharArray2 = scn.next().toCharArray();
		}
		*/
		
		CharArray array = new CharArray(JavaCharArray1);
		
		array.swapFirstAndLast();
		array.DisplayArray();
		//array.DispalyString();
		
		
	}
	
	

}

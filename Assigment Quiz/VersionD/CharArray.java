package VersionD;

public class CharArray {
	private char[] myCharArray;
	private char temp;
	private char first;
	private char last;
	
	public CharArray(char[] myCharArray) {
		this.myCharArray = myCharArray;
	}
	
	public void swapFirstAndLast() {
		first = myCharArray[0];
		temp = first;
		last  = myCharArray[myCharArray.length - 1];
		myCharArray[0] = last;
		myCharArray[myCharArray.length - 1] = temp;
	}
	
	public void DisplayArray() {
		for(char i: myCharArray){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void DisplayString() {
		for(char i: myCharArray){
			System.out.print(i);
		}
	}
}

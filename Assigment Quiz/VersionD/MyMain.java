package VersionD;

public class MyMain {
	public static void main(String[] args) {
		char[] arr = {'P', 'E', 'T', 'E', 'R'};
		CharArray charArr = new CharArray(arr);
		charArr.swapFirstAndLast();
		charArr.DisplayArray();
		charArr.DisplayString();
	}
}

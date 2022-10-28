package VersionA;

import java.util.Scanner;

public class MyMain {
	public static void main(String[] args) {
		int[] userLottery = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter lottery number" + (i + 1)+ ": ");
			userLottery[i] = scan.nextInt();
		}
		
		Lottery lottery = new Lottery();
		lottery.setUserLotter(userLottery);
		lottery.match();
		lottery.printResult();
	}
}

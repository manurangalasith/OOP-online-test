package VersionA;

import java.util.ArrayList;

public class Lottery {
	private int[] lotteryNumbers = new int[5];
	private int[] userLottery;
	private ArrayList<Integer> matches = new ArrayList<>();
	private int count;
	
	public Lottery() {
		for(int i = 0; i < 5; i++) {
			lotteryNumbers[i] = (int) (Math.random() * 10);
		}
	}
	
	public void setUserLotter(int[] userLottery){
		this.userLottery = userLottery;
	}
	public void match() {
		for(int i = 0; i < 5; i++) {
			if(userLottery[i] == lotteryNumbers[i]) {
				count++;
				matches.add(userLottery[i]);
			}
		}
	}
	
	public void printResult() {
		System.out.println("User's Numbers: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(userLottery[i] + " ");
		}
		
		System.out.println("Lottery Numbers: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(lotteryNumbers[i] + " ");
		}
		
		System.out.println("Number of matching digits: " + count);
		
		System.out.print("Matching digits: ");
		for (int i : matches) {
			System.out.print(i + " ");
		}
	}
}

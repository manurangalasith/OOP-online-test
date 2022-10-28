package VersionC;

public class RandNum {
	private int[][] arr = new int[5][5];
	private int min;
	private int max;
	private double avg;
	
	public RandNum() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	
	public void calcMinimum() {
		min = arr[0][0];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
	}
	
	public void calcMaximum() {
		max = arr[0][0];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
	}
	
	public void calcAverage() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				avg += arr[i][j];
			}
		}
		avg = (double) avg / 25; 
	}
	
	public void display() {
		System.out.println("minimum: " + min);
		System.out.println("maximum: " + max);
		System.out.println("average: " + avg);
	}
}

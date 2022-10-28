//Version B

class RandNum{
	private int[][] arr = new int[5][5];
	
	//generate a random  2D Array
	public RandNum(){
		
		int max = 100;
	    int min = 1;
	    int range = max - min +1;
	  
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				this.arr[i][j] = (int) (Math.random() * range) ;
			}
		}
	}
	
	//Getting Minimum Number of 2D array
	public int minNum(){
		int lower = 1000;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(lower > this.arr[i][j])
				{
					lower = this.arr[i][j];
				}
			}
		}
		return lower; //Return MIN value
	}
	
	
	//Getting Maximum number of 2D Array
	public int maxNum(){
		int high = minNum();
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(high < this.arr[i][j])
				{
					high = this.arr[i][j];
				}
			}
		}
		return high; //return MAX value
	}
	
	
	//Getting Average of 2D Array
	public double avarage(){
		int count = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				count = this.arr[i][j] + count;
			}
			
		}
		return count/25; // Return Average (SUM / count)
	}
	
	public   void display(RandNum num ){
		
		System.out.println("---------2D Array--------");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(this.arr[i][j] + "\t");
				
			}
			System.out.print("\n");
		}
		
		System.out.println("----minimum, maximum and average of the 25 values----");
		
		System.out.println("Minimum Number :  "+num.minNum());
		System.out.println("Maximum Number :  "+num.maxNum());
		System.out.println("Avarage Number :  "+num.avarage());
		
	
	}
	
	public static void main(String args[]){
		RandNum num = new RandNum();
		num.display(num);
		
	}
		
}


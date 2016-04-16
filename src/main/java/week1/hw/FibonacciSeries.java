package week1.hw;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] position = new int[20];
		position [0]=0;
		System.out.println(position[0]);
		position [1] = 1;
		System.out.println(position[1]);
		for (int i=2; i < 100; i++)
		{
			position [i] = position [i-1] + position [i-2];
			if(position[i]>100)
			{
				break;
			}
			System.out.println(position[i]);
		}
		
		}
			

	}


package week1.hw;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 30;
		int status = 1;
		
		int num = 3;
		System.out.println(2);
		for (int i=2;i<=count;)
		{
			for (int j=2; j<= (num/2);j++)
			{
				if (num % j ==0)
				{
					status = 0;
					break;
				}
			}
			if (status != 0)
			{
				System.out.println(num);
				i++;
			}
			status = 1;
			num++;
		}
	}
}

package printcode;

public class Fibonacci {

	public static void main(String[] args) {

		int firstnum = 0, secnum = 1, sum = 0;
		int n=11;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i = 1; i <=n; i++) 
		{
		
			sum= firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
		} 
		
	}

} 


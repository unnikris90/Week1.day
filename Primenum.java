package printcode;

public class Primenum {

	public static void main(String[] args) {
		int n=15;
		int m=n/2;
		int rem=0;
		for (int i = 2; i <=m; i++) {
			if(n%i==0) {
				System.out.println(n+" Non Prime");
				rem=1;
				break;
			}
		}
		if(rem==0) {
			System.out.println(n+" Prime Number");
		}
	}
}

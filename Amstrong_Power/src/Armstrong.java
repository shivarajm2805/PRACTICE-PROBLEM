
public class Armstrong {
	int thearmstrong(int n) {
		int sum=0;
		while(n>0) {
			int ld=n%10;
			sum=(int) Math.pow(ld,3)+sum;
			n=n/10;
		}
		return sum;
	}
}


public class ArmstrongToRise {
	int digi(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	int riseArmstrong(int n,int m) {
		int sum=0;
		while(n>0) {
			int ld=n%10;
			sum=(int) Math.pow(ld,m)+sum;
			n=n/10;
		}
		return sum;
	}

}

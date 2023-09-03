
public class Power {
	int power(int n) {
		int count=0;
		int power=1;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
		int risePower(int m,int n) {
			int power=1;
		for (int i=1;i<=m;i++) {
			power=power*n;
		}
		return power;
	}
	

}

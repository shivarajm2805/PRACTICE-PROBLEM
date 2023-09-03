
public class Digit {
	int count(int n) {
		if(n==0) return 1;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
		int cube(int m,int n) {
			int power=1;
			int sum=0;
			for(int i=1;i<=m;i++) {
			int r=n%10;
			sum=r*r*r+sum;
			n=n/10;
			}
			return sum;
			
			
		
	}

}

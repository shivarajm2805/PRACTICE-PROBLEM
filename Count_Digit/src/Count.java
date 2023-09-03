
public class Count {
	int count(int n) {
		int res=0;
		int digit=0;
		while(n>0) {
			digit=n%10;
			res++;
			n=n/10;
			
		}
		return res;
	}
}

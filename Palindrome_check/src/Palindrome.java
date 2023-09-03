
public class Palindrome {
	void Check_palindrome(int m) {
		int original=m;
		int rev=0;
		int n=0;
		while(m>0)
		{
			n=m%10;
			rev=10*rev+n;
			m=m/10;
		}
		if(rev==original) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}

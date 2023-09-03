
public class PR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i==0&&j<n/2 ||i==n/2&&j<n/2 || j==n/2&&i>0&&i<n/2 ||i>=n/2+1&&j==i-n/2)
//					if(j==0||i==0&&j<5 ||i==5&&j<5 || j==5&&i>0&&i<5 ||i>=5+1&&j==i-5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}

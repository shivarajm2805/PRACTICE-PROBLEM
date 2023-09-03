
public class PS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
//				if(i==0||j==0&&i<=5 ||i==5||i==10||j==10&&i>=5)
				if(i==0||j==0&&i<=n/2 ||i==n/2||i==n||j==n&&i>=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}

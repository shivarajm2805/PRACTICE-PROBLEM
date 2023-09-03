
public class Pd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0&&j<n||j==1 ||i==n&&j<n||j==n&&i>0&&i<n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}

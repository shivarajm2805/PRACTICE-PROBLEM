
public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
//				if(i==0&&j<=8||i==8&&j<=8||j==0 &&i<=8 ||j==8&&i<=8 ||i>5&&j==i)
					if(i==0&&j>0&&j<n-2||j==0&&i>0&&i<n-2 ||i==n-2&&j>0&&j<n-2||j==n-2&&i>0&&i<n-2||i>5&&j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}

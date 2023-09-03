
public class PW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(j==0||j==10 ||i>=5&&j==10-i||i>=5&&j==i )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}

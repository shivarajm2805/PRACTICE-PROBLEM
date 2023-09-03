
public class PY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i<=5&&i==j||i<=5&&j==10-i||j==5&&i>=5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}

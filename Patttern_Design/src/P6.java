
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 || j==5 ||i==5|| i==10|| j==10) {
					System.out.print("* ");}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}

	}

}

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random=new Random();
		
		int num=random.nextInt();
		System.out.println("Random intger: "+num);
		
		double num1=random.nextDouble();
		System.out.println("Random double: "+num1);
		
		int range=random.nextInt(100);
		System.out.println("Random intger in range 100: "+range);

		
		
		
	}

}

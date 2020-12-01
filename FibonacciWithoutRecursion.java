import java.util.Scanner;

public class FibonacciWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("entern a number");
		int n= sc.nextInt(); */
		
		
		int a=0;
		int b=1;
		int c;
		
		for (int i=0; i<8; i++) {
			System.out.print(a+ " ");
			c = a+b;
			a=b;
			b=c;
		}
	}

}

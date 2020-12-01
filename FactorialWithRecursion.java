import java.util.Scanner;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int f=sc.nextInt();
		
		System.out.println(factorial(f));
	}
	
	public static int factorial(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

}

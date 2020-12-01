import java.util.Scanner;

public class FibonacciWithRecursion {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		FibonacciWithRecursion obj=new FibonacciWithRecursion();
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		
	
		for(int i=1; i<=limit; i++) {
			System.out.print(obj.fibonacci(i)+ " ");
		}
	}

	public int fibonacci(int n){
		if(n==1) {
			return 0;
		}
		 if (n==2) {
			return 1;
		}
		 
			return fibonacci(n-1) + fibonacci(n-2); 
		
	}

}

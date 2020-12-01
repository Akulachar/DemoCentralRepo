import java.util.Scanner;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //take input and scan
		System.out.println("Enter a Number");
		int n= sc.nextInt();	//read string object and convert it to integer
		
		int c=0;	// counter to count 			
		for (int i=1; i<=n; i++) {
			if ( n % i == 0)	//check factor of number
				c++;
		}
		
		if(c==2)
			System.out.println(n+ " is a prime number");
		else
			System.out.println(n+ " is not a prime number");
	}
}

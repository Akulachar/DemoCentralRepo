import java.util.Scanner;

public class PallindromeStringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str= sc.nextLine();
		String org_str=str;
		
		String rev="";
		int len=str.length();
		for(int i=len-1; i>=0; i--) {
			rev=rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not pallindrome");
		}
	}

}

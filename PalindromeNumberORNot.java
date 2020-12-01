
public class PalindromeNumberORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 121, s = 0, r;
		int t=n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = (s * 10) + r;
		}
		if(t==s) {
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}

}

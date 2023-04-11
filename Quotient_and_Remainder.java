package Day_5;
import java.util.*;
public class Quotient_and_Remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no ");
		int a=sc.nextInt();
		System.out.println("Enter the dividing no");
		int b=sc.nextInt();
		int q = 0,r = 0;
		q=a/b;
		r=a%b;
		System.out.println("The Quotient is = "+q);
		System.out.println("The Quotient is = "+r);

	}

}

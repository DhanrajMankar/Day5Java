package Day_5;

import java.util.Scanner;

public class OddEvenNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number");
		
		int a=s.nextInt();
		if(a%2==0)
		{
			System.out.print("The Entered no is even");
		}
		else {
			System.out.print("The Entered no is odd");
		}
	}

}

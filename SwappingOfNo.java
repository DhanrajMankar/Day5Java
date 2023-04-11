package Day_5;

import java.util.Scanner;

public class SwappingOfNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter value of a");
		int a=s.nextInt();
		System.out.println("Enter value of b");
		int b=s.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("wapping without third variable");
		System.out.println("Enter value of a");
		int a1=s.nextInt();
		System.out.println("Enter value of b");
		int b1=s.nextInt();
		a1=a1+b1; 
		b1=a1-b1;
		a1=a1-b1;
		System.out.println("a="+a1);
		System.out.println("b="+b1);
		

	}

}

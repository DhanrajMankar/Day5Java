package Day_5;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term  ");
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      int s=1;
	      for(int i=1;i<=n;i++) {
	    	  
	    	  s=s*2;
	    	  System.out.println("2^"+i+" = " +s);
	      }

	}

}

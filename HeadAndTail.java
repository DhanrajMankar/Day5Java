package Day_5;

import java.util.Scanner;

public class HeadAndTail {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int head=0;
		int tail=0;
		float perHead,perTail;
		
		System.out.println("Pls Enter no of toes you want to try");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		double a = Math.random();
		if(a>0.5) {
			head++;
		}
		else {
			tail++;
		}
		}
		
		perHead=head*100/n;
		perTail=tail*100/n;
		System.out.println("Head Ocurring percentage is :"+perHead);
		System.out.println("Tail Ocurring percentage is :"+perTail);
		
	}

}

package Day_5;

import java.util.Scanner;

public class Vovel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the alphabate");
		
		//char c= sc.next().charAt(1); 
		char c='A';
        c=Character.toLowerCase(c);
		if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.print("Enter the alphabate is Vovel");
		}
		else {
			System.out.print("Enter the alphabate is not a vovel");
		}

	}

}

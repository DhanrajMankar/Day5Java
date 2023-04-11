package Day_5;
import java.util.*;
public class LargestNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the numbers");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int temp=b;
		
		if(a>b) {
			temp=a;
		}
		if(temp<c) {
			temp=c;
		}
		System.out.print("The gretest numbers is = "+temp);
		
	}

}

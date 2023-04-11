package Day_5;

import java.util.Scanner;
public class Factors {
   public static void main(String[] args) {
      int a, i;
      
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the number : ");
      a = s.nextInt();
      System.out.print("The factors of " + a + " are: ");
      for (i = 1; i <= a; ++i) {
         if (a % i == 0) {
            System.out.print(i + " ");
         }
      }
   }
}
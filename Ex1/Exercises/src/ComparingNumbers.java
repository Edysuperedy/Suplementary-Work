import java.util.Scanner;
public class ComparingNumbers{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n, x;
    System.out.println("Introduce the first number");
    n = Integer.valueOf(scan.nextLine());
    System.out.println("Enter the second number");
    x = Integer.valueOf(scan.nextLine());
    if (n > x) {
      System.out.println(n + " is greater than " + x);
    } else if (n < x)
    {
      System.out.println(n + " is less than " + x );
    }
    else System.out.println (n + " is equal to " + x);
  }
}
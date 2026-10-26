import java.util.Scanner;
public class Ex1{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int x;
        x=Integer.valueOf(scan.nextLine());
        x=x*x;
        System.out.println("The square of the number is:" + x);
    }
}
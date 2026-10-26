import java.util.Scanner;
public class Summation {
    public static int sum(int number1, int number2, int number3, int number4)
    {
        int sum;
        sum=number1+number2+number3+number4;
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int answer;
        int x,y,z,t;
        x=Integer.valueOf(scan.nextLine());
        y=Integer.valueOf(scan.nextLine());
        z=Integer.valueOf(scan.nextLine());
        t=Integer.valueOf(scan.nextLine());
        answer = sum(x,y,z,t);
        System.out.println("Sum "  + answer);
    }
}

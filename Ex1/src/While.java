import java.util.Scanner;
public class While{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int x;
        System.out.println("Give a number: ");
        while ( true )
        {
            x=Integer.valueOf(scan.nextLine());
            if(x == 4 ) break;
            else System.out.println("Give a number: ");
        }
    }
}
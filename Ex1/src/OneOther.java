import java.util.Scanner;
public class OneOther {
    public static void printUntilNumber (int numb) {
        for(int i=1; i <= numb ;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        int x;
        Scanner scan = new Scanner(System.in);
        x= Integer.valueOf(scan.nextLine());
        printUntilNumber(x);
    }
}

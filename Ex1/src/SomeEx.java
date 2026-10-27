import java.util.Scanner;
import java.util.ArrayList;
public class SomeEx {
    public static ArrayList<Integer> filterAffordable(ArrayList<Integer> list,int n)
    {
        ArrayList<Integer> listFinal = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)<=n)
            {
                listFinal.add(list.get(i));
            }
        }
        return listFinal;
    }
    public static void printInventory( ArrayList<Integer> list, ArrayList<String> list1)
    {
        for(int i=0;i < list.size();i++)
        {
            System.out.println ( list1.get(i)+ " " + list.get(i));
        }
    }
    public static int findMostExpensiveIndex(ArrayList<Integer> list)
    {
        int lower=-1;
        for(int i=0;i< list.size();i++) {
            if (lower <= list.get(i))
            {
                lower = list.get(i);
            }
        }
        return lower;
    }
    public static int sum(ArrayList<Integer> list)
    {
        return list.get(2)+list.get(1);
    }
    public static String thirdObject(ArrayList<String> list)
    {
        return list.get(2);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            String t = new String();
            t = scan.nextLine();
            if (t.equals("done")) break;
            else {
                list.add(t);
            }
        }
        System.out.println(thirdObject(list));
        System.out.println("Now introduce the numbers:");
        while (true) {
            int x = scan.nextInt();
            if (x == 0) break;
            else list1.add(x);
        }
        System.out.println(sum(list1));
        System.out.println(findMostExpensiveIndex(list1));
        printInventory(list1,list);
        System.out.println("Introduce the threshold:");
        int n;
        n = scan.nextInt();
        for (int i=0;i< filterAffordable(list1,n).size();i++)
        {
            System.out.println(filterAffordable(list1,n).get(i));
        }
    }
}

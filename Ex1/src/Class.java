import java.nio.file.Paths;
import java.util.*;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scan = new Scanner(Paths.get("Grades.txt"));

        while (scan.hasNextLine()) {
            String line = scan.nextLine().trim();
            String[] parts = line.split(",");
            list.add(new Student(parts[0], Double.valueOf(parts[1].trim())));
        }   

        String nume = "";
        double sum = 0;
        double max = -1.0;
        int n = list.size();

        for (int i = 0; i < n; i++) {
            if (max < list.get(i).getGrade()) {
                max = list.get(i).getGrade();
                nume = list.get(i).getName();
            }
            sum = sum + list.get(i).getGrade();
        }

        sum = sum / n;
        System.out.println(sum + " is the average, and the name of the top student is: " + nume);
    }
}
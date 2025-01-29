import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class arraylinklist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter the number of student entry:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("ENter the Student name");
            name.add(sc.nextLine());
            System.out.println("ENter the Student marks");
            marks.add(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("ENter the Student name" + name);
        System.out.println("ENter the Student name" + marks);
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += marks.get(i);

        }
        System.out.println(result);
    }

}

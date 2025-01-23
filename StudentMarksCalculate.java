import java.util.Scanner;

class Student {
    String Name;
    int Age;
    String Class;

    Student(String Name, int Age, String Class) {
        this.Name = Name;
        this.Age = Age;
        this.Class = Class;

    }

    void Display() {
        System.out.println("*---------------+---------------*");
        System.out.println("|" + "\t" + "Name: " + Name + "\t|");
        System.out.println("|" + "\t" + "Age: " + Age + "\t  |");
        System.out.println("|" + "\t" + "Class: " + Class + "\t|");
    }
}

class Student_Subject extends Student {
    String Sub1;
    String Sub2;
    String Sub3;
    float marks1;
    float marks2;
    float marks3;
    float Total_marks;
    float Percentage;

    Student_Subject(String Name, int Age, String Class, String Sub1, String Sub2, String Sub3, float marks1,
            float marks2,
            float marks3) {
        super(Name, Age, Class);
        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        Total_marks = marks1 + marks2 + marks3;
        Percentage = (Total_marks / 300) * 100;
    }

    void Display_Subject() {
        Display();
        System.out.println("*---------------+---------------*");
        System.out.println("|" + "\t" + "Sub1: " + Sub1 + " Marks=" + marks1 + " |");
        System.out.println("|" + "\t" + "Sub2: " + Sub2 + " Marks=" + marks2 + "   |");
        System.out.println("|" + "\t" + "Sub3: " + Sub3 + " Marks=" + marks3 + "    |");
        System.out.println("|" + "\t" + "Total_marks: " + Total_marks + "      |");
        System.out.println("|" + "\t" + "Percentage: " + Percentage + "       |");
        System.out.println("*----------------+-------------*");
    }

    float Avg_return() {
        return Percentage;
    }
}

class Remarks extends Student_Subject {
    String Remarks;
    float avg;

    Remarks(String Name, int Age, String Class, String Sub1, String Sub2, String Sub3, float marks1, float marks2,
            float marks3) {
        super(Name, Age, Class, Sub1, Sub2, Sub3, marks1, marks2, marks3);
        avg = Avg_return();
        if (avg >= 70) {
            Remarks = "First Class";
        }

        else if (avg >= 60) {
            Remarks = "Pass";
        } else {
            Remarks = "Fail";
        }

    }

    void Display_Remark() {
        Display_Subject();
        System.out.println("|" + "\t" + "Remarks: " + Remarks + "\t|");
        System.out.println("*----------------+-------------*");

    }
}

public class StudentMarksCalculate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Studen Name:");
        String Name = scanner.nextLine();
        System.out.println("Enter Studen Age:");
        int Age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Studen Class:");
        String Class = scanner.nextLine();
        System.out.println("Enter Studen Subject Name1:");
        String sub1 = scanner.nextLine();
        System.out.println("Enter Studen Subject Name2:");
        String sub2 = scanner.nextLine();
        System.out.println("Enter Studen Subject Name3:");
        String sub3 = scanner.nextLine();
        System.out.println("Enter Studen Subject Marks1:");
        int marks1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Studen Subject Marks2:");
        int marks2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Studen Subject Marks3:");
        int marks3 = Integer.parseInt(scanner.nextLine());
        Remarks obj = new Remarks(Name, Age, Class, sub1, sub2, sub3, marks1, marks2, marks3);
        obj.Display_Remark();
    }
}
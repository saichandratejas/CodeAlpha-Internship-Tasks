package codealpha;

import java.util.Scanner;

public class GradeTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students");
        int students = sc.nextInt();

        String[] name = new String[students];
        double[] marks = new double[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter Name of Student " + (i + 1) + ":");
            name[i] = sc.next();
            System.out.println("Enter Marks of Student " + (i + 1) + ":");
            marks[i] = sc.nextDouble();
        }
        
        double sum = 0;
        double highest_marks = marks[0];
        double lowest_marks = marks[0];
        int highest_index = 0;
        int lowest_index = 0;
        
        for (int i = 0; i < students; i++) {
            double mark = marks[i];
            sum += mark;
            if (mark > highest_marks) {
                highest_marks = mark;
                highest_index = i;
            }
            if (mark < lowest_marks) {
                lowest_marks = mark;
                lowest_index = i;
            }
        }
        
        double avg_marks = sum / students;
        System.out.println("Grade Summary");
        System.out.println("Avg Grade: " + avg_marks);
        System.out.println("Highest Marks: " + highest_marks + " student: " + name[highest_index]);
        System.out.println("Lowest Marks: " + lowest_marks + " student: " + name[lowest_index]);

        sc.close();
    }
    
}

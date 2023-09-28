import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of subject: ");
        int numSubjects = sc.nextInt();

        double totalmarks = 0.0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("enter the marks: ");
            double marks = sc.nextDouble();
            totalmarks += marks;

        }
        double averagepercentage = totalmarks / (numSubjects * 100.0);

        String grade;
        if (averagepercentage <= 0.9) {
            grade = "A+";
        } else if (averagepercentage <= 0.8) {
            grade = "A";
        } else if (averagepercentage <= 0.7) {
            grade = "b";
        } else if (averagepercentage <= 0.6) {
            grade = "c";
        } else if (averagepercentage <= 0.5) {
            grade = "d";
        } else {
            grade = "f";
        }
        System.out.println("\nResult");
        System.out.println("total marks");
        System.out.println("average percentage" + (averagepercentage * 100) + "%");
        System.out.println("grade" + grade);

        sc.close();
    }
}

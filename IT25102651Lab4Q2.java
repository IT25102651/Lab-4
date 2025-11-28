import java.util.Scanner;

public class IT25102651Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input exam marks
        System.out.print("Enter exam marks (0 - 100): ");
        double examMarks = input.nextDouble();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Error: Exam marks must be between 0 and 100.");
            return;
        }

        // Input lab marks
        System.out.print("Enter lab submission marks (0 - 100): ");
        double labMarks = input.nextDouble();

        // Validate lab marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Error: Lab submission marks must be between 0 and 100.");
            return;
        }

        // Input exam percentage
        System.out.print("Enter percentage taken from exam: ");
        double examPercent = input.nextDouble();

        // Input lab percentage
        System.out.print("Enter percentage taken from lab submissions: ");
        double labPercent = input.nextDouble();

        // Validate percentages sum to 100
        if (examPercent + labPercent != 100) {
            System.out.println("Error: The sum of percentages must be 100.");
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercent / 100) +
                           (labMarks * labPercent / 100);

        // Output result
        System.out.println("Final Exam Mark = " + finalMark);
    }
}
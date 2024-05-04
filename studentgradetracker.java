import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of tests
        System.out.println("Enter the no.of Tests: ");
        int tests = scanner.nextInt();

        // Create a 2D array to store student data (marks, percentage)
        double[][] studentData = new double[tests][6];

        // Input loop for student details
        for (int i = 0; i < tests; i++) {
            System.out.println("\nEnter details of Test " + (i+1) + ": ");

            // Get marks for each subject (with input validation)
            for (int j = 0; j < 5; j++) {  // Loop for 5 subjects
                System.out.print("Marks for Subject " + (j + 1) + ": ");
                double marks;
                do {
                    marks = scanner.nextDouble();
                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    }
                } while (marks < 0 || marks > 100);
                studentData[i][j] = marks;  // Store marks
            }
        }

        // Calculate and store percentages
        for (int i = 0; i < studentData.length; i++) {
            double totalMarks = 0;
            for (int j = 0; j < 5; j++) {
                totalMarks += studentData[i][j];
            }
            double percentage = totalMarks / 5;  // Adjust for number of subjects
            studentData[i][5] = percentage;  // Store percentage
        }

        // Print table header
        System.out.println("\n====================================================");
        System.out.println("| Test | Subject 1 | Subject 2 | Subject 3 | Subject 4 | Subject 5 | Percentage |");
        System.out.println("====================================================");

        // Print student data in table format
        for (int i = 0; i < tests; i++) {
            System.out.print("| Test " + (i+1));
            for (int j = 0; j < 6; j++) {
                System.out.printf(" | %9.2f", studentData[i][j]);
            }
            System.out.println(" |");
        }

        System.out.println("====================================================");
        System.out.println("Targate CGPA : 9.5");
        float a =0;
        int b =0;
        for (int i = 0; i < tests; i++) {
            b += studentData[i][5];
            }
        a = (b/tests) ;
        
        System.out.print("Actual CGPA : " + a/9.5);
        scanner.close();  // Close scanner to avoid resource leaks
        
     System.out.println("\n**Reminder:** Assignment deadline is approaching!");

    
    }
}

import java.util.Scanner;
import java.util.Random;

public class TimeSpeedDistanceExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String anotherProblem;

        do {
            System.out.println("TIME - SPEED - DISTANCE EXERCISE");

            // Generate random values
            int C = random.nextInt(25) + 40; // Speed of car (C)
            int D = random.nextInt(15) + 5;   // Difference in hours (D)
            int T = random.nextInt(19) + 20;  // Speed of train (T)

            // Display the problem
            System.out.printf("A CAR TRAVELING %d MPH CAN MAKE A CERTAIN TRIP IN\n", C);
            System.out.printf("%d HOURS LESS THAN A TRAIN TRAVELING AT %d MPH.\n", D, T);
            System.out.print("HOW LONG DOES THE TRIP TAKE BY CAR: ");

            // User input
            double A = scanner.nextDouble();

            // Calculate the correct answer
            double V = (double) D * T / (C - T);
            int E = (int) Math.round(Math.abs((V - A) * 100 / A));

            // Check the answer and provide feedback
            if (E > 5) {
                System.out.printf("SORRY. YOU WERE OFF BY %d PERCENT.\n", E);
            } else {
                System.out.printf("GOOD! ANSWER WITHIN %d PERCENT.\n", E);
            }
            System.out.printf("CORRECT ANSWER IS %.2f HOURS.\n", V);
            System.out.println();

            // Ask if the user wants another problem
            System.out.print("ANOTHER PROBLEM (YES OR NO): ");
            anotherProblem = scanner.next();
            System.out.println();

        } while (anotherProblem.equalsIgnoreCase("YES"));

        scanner.close();
    }
}

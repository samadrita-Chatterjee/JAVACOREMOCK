package in.ineuron.comp;


import java.util.ArrayList;
import java.util.Scanner;

public class CalculateAvg {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average;
        int count = 0;
        boolean continueInput;

        do {
            System.out.print("Enter a number (or any non-numeric value to exit): ");
            if (scanner.hasNextDouble()) {
                numbers.add(scanner.nextDouble());
                sum += numbers.get(count);
                count++;
                continueInput = true;
            } else {
                continueInput = false;
            }
            scanner.nextLine(); // Consume the newline character
        } while (continueInput);

        if (count > 0) {
            average = sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}

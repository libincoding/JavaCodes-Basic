import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}

public class NumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter how many numbers you want to input: ");
            int n = sc.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NegativeException("Negative number entered: " + num);
                }
                numbers[i] = num;
            }

            System.out.println("\nYou entered all positive numbers:");
            for (int x : numbers) {
                System.out.print(x + " ");
            }

        } catch (NegativeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

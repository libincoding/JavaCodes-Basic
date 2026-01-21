import java.util.*;

class NegativeException extends Exception {
}

public class CheckNegative {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter how many numbers: ");
int n = sc.nextInt();

for (int i = 1; i <= n; i++) {
try {
System.out.print("Enter number: ");
int num = sc.nextInt();

if (num < 0) {
throw new NegativeException();
}

System.out.println("Number is: " + num);
} catch (NegativeException e) {
System.out.println("Negative number not allowed");
}
}

}
}
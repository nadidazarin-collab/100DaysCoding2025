import java.util.Scanner;

public class OperatorIncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();
        System.out.println("Nilai x awal: " + x);

        // Operator Increment
        x++;
        System.out.println("Nilai x setelah increment: " + x);

        // Operator Decrement
        x--;
        System.out.println("Nilai x setelah decrement: " + x);
    }
}

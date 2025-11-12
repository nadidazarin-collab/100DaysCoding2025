import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tinggi pola: ");
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println("|");
        }
    }
}

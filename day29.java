import java.util.Scanner;

public class OperatorPerbandingan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println(a + " lebih kecil dari " + b);
        } else if (a > b) {
            System.out.println(a + " lebih besar dari " + b);
        } else {
            System.out.println(a + " sama dengan " + b);
        }

        
    }
}

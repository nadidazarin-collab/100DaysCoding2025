import java.util.Scanner;

public class OperatorPerbandingan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        System.out.println(a <= b ? a + " lebih kecil dari atau sama dengan " + b : a + " lebih besar dari " + b);
        System.out.println(a >= b ? a + " lebih besar dari atau sama dengan " + b : a + " lebih kecil dari " + b);

      
    }
}

import java.util.Scanner;

public class TukarNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Masukkan nilai a (int): ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b (double): ");
        double b = scanner.nextDouble();

        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);

        a = (int) (a + b); // a menjadi jumlah dari a dan b
        b = a - b;         // b menjadi nilai awal a
        a = (int) (a - b); // a menjadi nilai awal b

        System.out.println("Setelah ditukar: a = " + a + ", b = " + b);
    }
}

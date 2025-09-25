import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Meminta input 
        System.out.print("Masukkan nilai (int): ");
        int angkaInt = in.nextInt();

        // Konversi otomatis dari int ke double
        double angkaDouble = angkaInt;

        System.out.println("Nilai int sebelum di konversi: " + angkaInt);
        System.out.println("Nilai setelah konversi ke double: " + angkaDouble);
    }
}

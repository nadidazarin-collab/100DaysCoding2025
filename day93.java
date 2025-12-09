import java.util.Scanner;

public class day93 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = input.nextDouble();

        System.out.println("\n=== HASIL PEMBULATAN ===");
        System.out.println("Angka asli      : " + angka);
        System.out.println("Math.ceil()     : " + Math.ceil(angka));
        System.out.println("Math.floor()    : " + Math.floor(angka));
        System.out.println("Math.round()    : " + Math.round(angka));

    }
}

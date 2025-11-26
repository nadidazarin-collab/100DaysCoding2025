import java.util.Scanner;

public class d81 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array: 10, 20, 30, 40, 50");
        System.out.print("Masukkan indeks (0-4): ");
        int indeks = scanner.nextInt();

        if (indeks >= 0 && indeks < angka.length) {
            System.out.println("Angka di indeks " + indeks + ": " + angka[indeks]);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}

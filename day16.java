import java.util.Scanner;
public class Nomor9 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan Angka1: ");
    int angka1 = in.nextInt();
    System.out.print("Masukkan Angka2: ");
    int angka2 = in.nextInt();

    System.out.println("Perkalian : " + angka1*angka2);
    System.out.println("Pembagian: " + angka1/angka2);
         
  }
}

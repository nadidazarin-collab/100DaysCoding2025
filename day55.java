import java.util.Scanner;
public class eval {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Batas Bawah : ");
    int a = input.nextInt;
    System.out.print("Batas Atas : ");
    int b = input.nextInt;
    System.out.print("Angka : ");
    int angka = input.nextInt;
   
    if (angka >= a && angka <= b){
      System.out.println("YAYAYAYA");
    }else {
      System.out.println("NONONONO");
    }

  }

}

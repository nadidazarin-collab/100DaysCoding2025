import java.util.Scanner;
public class eval {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Batas Bawah : ");
    int a = in.nextInt;
    System.out.print("Batas Atas : ");
    int b = in.nextInt;
    System.out.print("Angka : ");
    int angka = in.nextInt;
   
    if (angka >= a && angka <= b){
      System.out.println("YAYAYAYA");
    }else {
      System.out.println("NONONONO");
    }

  }

}

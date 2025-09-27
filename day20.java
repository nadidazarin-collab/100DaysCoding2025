import java.util.Scanner;


public class day20java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        in.nextLine();
       
        System.out.print("Masukkan benar/salah: ");
        boolean a = in.nextBoolean();
        in.nextLine();
        
        System.out.print("Masukkan desimal: ");
        double des = in.nextDouble();
        in.nextLine();
        
        String strangka = "" + angka;
        String strbool = String.valueOf(a);
        String strdouble = Double.toString(des);
        
        System.out.println("int = " + angka);
        System.out.println("boolean = " + a);
        System.out.println("double = " + des);
                
                
    }
  
    
}

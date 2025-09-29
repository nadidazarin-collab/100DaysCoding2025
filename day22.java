import java.util.Scanner;
public class day22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi: ");
        double sisi = in.nextDouble();
       
        //rumus luas sisi*sisi
        double luas = sisi*sisi;
        
        System.out.println("Luas persegi adalah: " + luas);
        
    }
    
}

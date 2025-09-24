package pkg100daysofjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka1 : ");
        double angka1 = in.nextDouble();        
        System.out.print("Masukkan angka2 : ");
        double angka2 = in.nextDouble();
        
        double sisaBagi = angka1 % angka2;
        
        System.out.println("Hasil Sisa Bagi : " + sisaBagi);                
    }
    
}

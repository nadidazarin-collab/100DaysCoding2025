package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ketik 'true' (nyala) atau 'false'(mati): ");
        boolean statusLampu = scanner.nextBoolean();
        scanner.nextLine();
        
  
        System.out.println("Status lampu: " + (statusLampu? "Lampu nyala" : "Lampu mati"));
                
        
    }
    
}

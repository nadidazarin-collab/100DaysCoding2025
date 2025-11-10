import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M: ");
        int m = scanner.nextInt();
        
        System.out.print("N (pangkat): ");
        int n = scanner.nextInt();

        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= m; 
        }

        
        System.out.println( m + " pangkat " + n + ": " + hasil);

        
    }
}

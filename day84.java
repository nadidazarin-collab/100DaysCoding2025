import java.util.Scanner;
public class eval3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print(" ");
        String nama = scanner.nextLine();
        System.out.print(" ");
        int jumlah = scanner.nextInt(); 
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(nama);
        }   
    }
}

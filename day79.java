import java.util.Scanner;

public class d79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usernameBenar = "nadida";
        String passwordBenar = "12345";

        boolean loginBerhasil = false;
        while (!loginBerhasil) {
            System.out.println("\n=== Login ===");
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(usernameBenar) && inputPassword.equals(passwordBenar)) {
                System.out.println("Login berhasil! Selwelcome, " + usernameBenar + "!");
                loginBerhasil = true;
            } else {
                System.out.println("Username atau password salah. Coba lagi.");
            }
        }
    }
}

public class Continue {
    public static void main(String[] args) {
        System.out.println("Angka genap dari 1 hingga 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Melewati angka ganjil
            }
            System.out.println("Angka genap: " + i);
        }
    }
}

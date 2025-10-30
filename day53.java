public class day53 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Angka dari 1 hingga 5 (berhenti di 3):");

        while (i <= 5) {
            if (i == 4) {
                break; 
            }
            System.out.println("Angka: " + i);
            i++;
        }
    }
}

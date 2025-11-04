public class LatihanLoopSederhana {
    public static void main(String[] args) {
        int N = 5; 
        
        System.out.println("Angka dari 1 sampai " + N + ":");      
        // Mencetak 1, 2, 3, 4, 5
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }       
        System.out.println("\n"); 
        System.out.println("Angka dari " + N + " sampai 1:");
        // Mencetak 5, 4, 3, 2, 1
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

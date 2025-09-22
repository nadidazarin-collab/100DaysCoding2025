public class Main {
    public static void main(String[] args) {
        // Mengubah string menjadi tipe data primitif
        String strAngka1 = "10";
        String strAngka2 = "5";

        // string ke integer
        int angka1 = Integer.parseInt(strAngka1); 
        int angka2 = Integer.parseInt(strAngka2); 

        // Operator aritmatika penjumlahan dan pengurangan
        int jumlah = angka1 + angka2;
        int kurang = angka1 - angka2; 

        
        System.out.println("Hasil penjumlahan: " + jumlah); 
        System.out.println("Hasil pengurangan: " + kurang); 

    
    }
}

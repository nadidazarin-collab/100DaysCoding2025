public class CekString {
    public static void main(String[] args) {

        String kalimat = "Halo Dunia";
      
        System.out.println("Apakah sama dengan 'Halo Dunia'? " + kalimat.equals("Halo Dunia"));

        System.out.println("Apakah sama dengan 'halo dunia' (tanpa peduli case)? " + kalimat.equalsIgnoreCase("halo dunia"));

        System.out.println("Apakah mengandung kata 'Dunia'? " + kalimat.contains("Dunia"));
      
        System.out.println("Apakah string kosong? " + kalimat.isEmpty());

        // Contoh dengan string kosong
        String kosong = "";
        System.out.println("\nApakah string kosong? " + kosong.isEmpty());
    }
}

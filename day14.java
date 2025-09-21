package javaday14;
public class Javaday14 {
    public static void main(String[] args) {
        String str1 = "1234567890";
        long nilai = Long.parseLong(str1);
        
        String str2 = "31.5";
        float suhu = Float.parseFloat(str2);
        
        System.out.println( "angka: " + nilai);
        System.out.println( "suhu hari ini: " + suhu);
    }
    
}

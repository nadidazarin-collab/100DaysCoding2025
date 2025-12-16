
package array_ddp;
    import java.util.Scanner;
public class lastday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean kataI = false;
        boolean kataS = false;
        boolean kataC = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!foundI) {
                if (ch == 'I') {
                    kataI = true;
                }
            } else if (!foundS) {
                if (ch == 'S') {
                    kataS = true;
                }
            } else {
                if (ch == 'C') {
                    kataC = true;
                    break;
                }
            }
        }

        if (kataI && kataS && kataC) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}

    


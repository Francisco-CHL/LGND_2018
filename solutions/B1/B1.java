import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        while (true) {
            input = in.nextLine().toUpperCase();
            if (input.length() < 4 || input.length() > 20) {
                System.out.println("Ingrese un texto entre 4 y 20 caracteres");
            } else {
                break;
            }
        }
        char[] str_chr = input.toCharArray();
        for (int i = 0; i < str_chr.length; i++) {
            int assci = (int) str_chr[i];
            System.out.print(assci);
        }
        System.out.println("");
        in.close();
    }
}
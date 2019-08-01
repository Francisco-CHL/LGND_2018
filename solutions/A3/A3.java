import java.util.*;

public class A3 {
    public static void main(String[] args) {
        // String input = "TODOS SON GENIOS";
        String input = "TAMARA";
        char[] str_chr = input.toCharArray();
        for (int i = str_chr.length - 1; i >= 0; i--) {
            System.out.print(str_chr[i]);
        }
        System.out.println("");
    }
}
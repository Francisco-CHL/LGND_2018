import java.util.*;

public class A1 {
    public static void main(String[] args) {
        /*
         * Scanner in = new Scanner(System.in); String input = in.nextLine();
         * System.out.println(input);
         * 
         * in.close();
         */
        String input = "10,08,07,10,02,07,10,05,09";
        String[] numeros = input.split(",");
        String output = "";
        int limit = 0;
        for (int i = 0; i < numeros.length; i++) {
            output += numeros[i] + " ";
            limit++;
            if (limit == 3) {
                System.out.println(output.trim());
                output = "";
                limit = 0;
            }
        }
    }
}
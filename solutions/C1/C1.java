import java.util.*;

public class C1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String input = in.nextLine();
        // String input = ".-.. --- ... *--. . -. .. --- ... *-. --- *-.. ..- . .-. -- .
        // -.";
        String input = ".... --- .-.. .-";
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

        in.close();
        String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        String output = "";
        String[] msge = input.split("\\*");
        for (int i = 0; i < msge.length; i++) {
            String[] word = msge[i].split(" ");
            for (int j = 0; j < word.length; j++) {
                for (int k = 0; k < morse.length; k++) {
                    if (word[j].equals(morse[k])) {
                        output += abc[k];
                        break;
                    }
                }
            }
            output += " ";
        }
        System.out.println(output.trim().toUpperCase());
    }
}
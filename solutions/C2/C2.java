import java.util.*;

public class C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        // String input = ".--. .. -. -.- -.--";
        // String input = ". ... - .- -- --- ... / .- / .-.. .- ... / .--. ..- . .-. -
        // .- ... / -.. . / -.. --- -- .. -. .- .-. / .- .-.. / -- ..- -. -.. ---";
        // String input = ".... --- .-.. .-";
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "---...",
                "--..--", "-.-.-.", "..--..", ".-..-.", ".......", ".-...", ".-.-." };

        in.close();
        String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ":", ",", ";",
                "?", "''", "error", "esperar", "fin de mensaje" };
        String output = "";
        String[] msge = input.split("/");
        boolean match = false;
        for (int i = 0; i < msge.length; i++) {
            String[] word = msge[i].split(" ");
            for (int j = 0; j < word.length; j++) {
                for (int k = 0; k < morse.length; k++) {
                    if (word[j].equals(morse[k])) {
                        output += abc[k];
                        match = true;
                        break;
                    } else {
                        match = false;
                    }
                }
            }
            output += " ";
        }
        if (match == false) {
            System.out.println("pasapalabra");
        } else {
            System.out.println(output.trim().toLowerCase());
        }
    }
}

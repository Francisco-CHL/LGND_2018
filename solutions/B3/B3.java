import java.util.*;

public class B3 {
    public static void main(String[] args) {
        // Mr. Magoo
        Scanner in = new Scanner(System.in);
        String input = "{1,2,3,4},{5,6},{5,6},{7,8,9,10,11,12},{13}";
        input = input.replace("},{", "}-{");
        String[] s = input.split("-");
        int n = 0;
        String output = "";
        // String input = in.nextLine():

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i != j) {
                    if (s[i].equals(s[j])) {
                        s[i] = "";
                    }
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i] != "") {
                output = s[i];
            }

        }
        System.out.println("");
        in.close();
    }
}
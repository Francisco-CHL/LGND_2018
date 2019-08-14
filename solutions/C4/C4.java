import java.util.*;

public class C4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String input = in.nextLine();
        String input = "4 4 3 0 1 0 3 1 2 0 0 2 0 0 0 1 2 0";
        // String input = "4 4 2 0 1 0 3 1 2 0 0 2 0 0 0 5 7 0";
        String[] arr = input.split(" ");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);
        String[][] matrix = new String[rows][cols];
        int index = 2;
        String out = "";
        String out2 = "";
        String output = "";
        int res = 0;
        int res2 = 0;
        boolean existe = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = arr[index];
                index++;
            }
        }
        int rec = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                out += matrix[i][j];
                res += Integer.parseInt(matrix[i][j]);
                if (j == cols - 1) {
                    for (int k = 0; k < rows; k++) {
                        for (int l = 0; l < cols; l++) {
                            out2 += matrix[l][k];
                            res2 += Integer.parseInt(matrix[l][k]);
                            if (l == cols - 1) {
                                if (res == res2) {
                                    existe = true;
                                    output += res + " = " + out + ";" + out2 + "\n";
                                }
                                res2 = 0;
                                out2 = "";
                            }
                        }
                    }
                    res = 0;
                    out = "";
                }
            }
        }

        if (existe == true) {
            System.out.print(output);
        } else {
            System.out.println("SIN PORCIONES EQUIVALENTES");
        }

    }
}

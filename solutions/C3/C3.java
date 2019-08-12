import java.util.*;

public class C3 {
	public static void main(String[] args) {
		String inManual = "1 2 X 4 5 6 7 8 9 10-11 12 13 Q 15 16 17 T 19 20-V 22 23 24 25 26 J 28 29 30-31 32 33 34 F 36 37 38 39 D-41 42 43 44 45 46 47 48 49 50-51 52 53 54 55 56 57 58 59 60-61 62 63 64 65 66 67 68 V 70-71 S 73 74 75 E 77 78 79 80-81 82 83 84 C 86 87 88 M 90-91 K 93 94 95 96 97 98 99 100";
		String linea[] = inManual.split("-");
		Scanner in = new Scanner(System.in);
		String[][] matriz = new String[10][10];

		for (int i = 0; i < 10; i++) {
			// String input = in.nextLine();
			// in.close();
			String[] line = linea[i].split(" ");// Cambiar linea[] por input[]
			for (int j = 0; j < line.length; j++) {
				matriz[i][j] = line[j];
			}
		}

		for (int i = 0; i < 10; i = i + 2) {
			int updown = i;
			for (int j = 0; j < 10; j++) {
				if (updown % 2 == 0) {
					if (isValid(matriz[updown][j])) {
						System.out.print(matriz[updown][j]);
						if (j < 9) {
							System.out.print(" ");
						}
					}
					updown++;
				} else {
					if (isValid(matriz[updown][j])) {
						System.out.print(matriz[updown][j]);
						if (j < 9) {
							System.out.print(" ");
						}
					}
					updown--;
				}
			}
			System.out.println("");
		}
	}

	public static boolean isValid(String n) {
		try {
			int number = Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

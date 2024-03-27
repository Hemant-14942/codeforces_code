import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;

            String[][] str = new String[10][10];
            for (int i = 0; i < 10; i++) {
                String rowInput = scan.nextLine();
                for (int j = 0; j < 10; j++) {
                    str[i][j] = Character.toString(rowInput.charAt(j));
                }
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (str[i][j].equals("X")) {
                        if ((i == 0 || i == 9) && (j >= 0 && j <= 9) || (j == 0 || j == 9) && (i >= 0 && i <= 9)) {
                            score1 += 1;

                        }
                        if ((i == 1 || i == 8) && (j >= 1 && j <= 8) || (j == 1 || j == 8) && (i >= 1 && i <= 8)) {
                            score2 += 1;

                        }
                        if ((i == 2 || i == 7) && (j >= 2 && j <= 7) || (j == 2 || j == 7) && (i >= 2 && i <= 7)) {
                            score3 += 1;

                        }
                        if ((i == 3 || i == 6) && (j >= 3 && j <= 6) || (j == 3 || j == 6) && (i >= 3 && i <= 6)) {
                            score4 += 1;

                        }
                        if ((i == 4 || i == 5) && (j >= 4 && j <= 5) || (j == 4 || j == 5) && (i >= 4 && i <= 5)) {
                            score5 += 1;

                        }
                    }
                }
            }
            System.out.println(1 * score1 + 2 * score2 + 3 * score3 + 4 * score4 + 5 * score5);
        }
    }
}

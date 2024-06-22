package RaghuSir.Recursion;
import java.util.HashSet;
public class Pro18 {
    public static void main(String[] args) {
        String[][] board =
                          {{"5", "3", ".", ".", "7", ".", ".", ".", "."}
                        , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                        , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                        , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                        , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                        , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                        , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                        , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                        , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
        char[][] chBoard = new char[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j].equals(".")) {
                    chBoard[i][j] = '.';
                } else {
                    chBoard[i][j] = board[i][j].charAt(0);
                }
            }
        }

        System.out.println(isValidSudoku(chBoard));

    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!seen.add(val + "found in row " + i) ||
                            !seen.add(val + "found in col " + j) ||
                            !seen.add(val + " found in box " + i / 3 + "-" + j / 3)) return false;
                }
            }
        }
        return true;
    }
}

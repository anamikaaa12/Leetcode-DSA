import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {

            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> boxSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                // Row
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }

                // Column
                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }

                // 3×3 Box
                int row = 3 * (i / 3) + j / 3;
                int col = 3 * (i % 3) + j % 3;

                if (board[row][col] != '.' && !boxSet.add(board[row][col])) {
                    return false;
                }
            }
        
        }
        return true;
    }
}
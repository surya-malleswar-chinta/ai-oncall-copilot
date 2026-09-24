class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int index = 0; index < 9; index++) {
            if (!isValidRow(board, index)) return false;
            if (!isValidColumn(board, index)) return false;
        }

        for (int row = 0; row < 9; row = row+3) {
            for (int col = 0; col < 9; col = col+3) {
                if (!isValidSmallBoard(board, row, col)) return false;
            }
        }

        return true;
    }

    boolean isValidRow(char[][] board, int row) {
        Set<Character> set = new HashSet<Character>();
        for (int column = 0; column < 9; column++) {
            char ch = board[row][column];
            if (ch == '.') continue;
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    boolean isValidColumn(char[][] board, int col) {
        Set<Character> set = new HashSet<Character>();
        for (int row = 0; row < 9; row++) {
            char ch = board[row][col];
            if (ch == '.') continue;
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    boolean isValidSmallBoard(char[][] board, int row, int col) {
        Set<Character> set = new HashSet<Character>();
        for (int curRow = row; curRow < row+3; curRow++) {
            for (int curCol = col; curCol < col+3; curCol++) {
                char ch = board[curRow][curCol];
                if (ch == '.') continue;
                if (set.contains(ch)) return false;
                set.add(ch);
            }
        }
        return true;
    }
}


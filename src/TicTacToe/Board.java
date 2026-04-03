package TicTacToe;

public class Board {
    private char[][] board;
    private final int size;

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
        initializeBoard();
    }
    void initializeBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                board[i][j]=' ';
            }
        }
    }

    boolean isValidInput(int row, int col){
        if(row<0 || row>=size || col<0 || col >=size){
            return false;
        }
        return true;
    }

    boolean isPositionFilled(int row, int col, char symbol){
        if(board[row][col]!=' '){
            return true;
        }
        return false;
    }

    boolean didCurrentPlayerWon(int row, int col, char symbol){
        boolean win = true;
        for(int j=0;j<size;j++){
            if(board[row][j]!= symbol){
                win = false;
                break;
            }
        }
        if(win){
            System.out.println("won in row matching");
            return true;
        }

        win = true;
        for(int i=0;i<size;i++){
            if(board[i][col]!= symbol){
                win = false;
                break;
            }
        }

        if(win){
            System.out.println("won in column matching");
            return true;
        }

        win = true;
        for(int i=0;i<size;i++){
            if(board[i][i]!= symbol){
                win = false;
                break;
            }
        }
        if(win){
            System.out.println("won in diagonal matching");
            return true;
        }

        win = true;
        for(int i=0;i<size;i++){
            if(board[i][size-i-1]!= symbol){
                win = false;
                break;
            }
        }

        if(win){
            System.out.println("won in anti diagonal matching");
            return true;
        }

        return win;
    }

    boolean isDraw(){
        boolean draw = true;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==' '){
                    draw = false;
                    break;
                }
            }
        }
        return draw;
    }

    void setValue(int row, int col, char symbol){
        board[row][col] = symbol;
    }

    public int getSize() {
        return size;
    }
}

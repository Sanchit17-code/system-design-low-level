package TicTacToe;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class GameEngine {
    private Board boardObj;
    private List<Player> players;
    private int currentIndex;

    public GameEngine(List<Player> players, int size) {
        this.players = players;
        boardObj = new Board(size);
        currentIndex=0;
    }

    public void play(){
        Scanner scanner = new Scanner(System.in);


        while(true){
            Player currentPlayer = players.get(currentIndex);
            int size = boardObj.getSize();
            System.out.println("please enter your move");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            char currentPlayerSymbol = currentPlayer.getSymbol();
            if(!boardObj.isValidInput(row,col)){
                System.out.println("invalid input! try again");
                continue;
            }
            if(boardObj.isPositionFilled(row,col,currentPlayerSymbol)){
                System.out.println("already filled! try again");
                continue;
            }
            boardObj.setValue(row,col, currentPlayerSymbol);

            if(boardObj.didCurrentPlayerWon(row,col,currentPlayerSymbol)){
                System.out.println(currentPlayer.getName() + " Won the game");
                break;
            }
            if(boardObj.isDraw()){
                System.out.println("game is draw");
                break;
            }
            currentIndex = (currentIndex+1)%players.size();
        }
        scanner.close();
    }

}

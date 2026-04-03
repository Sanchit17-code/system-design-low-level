package SnakeAndFood;

import java.util.Objects;

public class CollisionsCoordinates {
    private final Board board;
    private final Snake snake;

    public CollisionsCoordinates(Board board, Snake snake) {
        this.board = board;
        this.snake = snake;
    }

    public boolean isCollisionHappening(Coordinate positionToCheck){

        Coordinate currentHeadPos = this.snake.getSnakeCoordinates().peekFirst();
        int x = positionToCheck.getX();
        int y = positionToCheck.getY();

        int L = this.board.getL();
        int W = this.board.getW();

        if(x<0 || x>=L || y<0 || y>=W){
            System.out.println("collided with the boundary");
            return true;
        }
        if(this.snake.getSnakeCoordinates().contains(positionToCheck)){
            System.out.println("collided with its body");
            return true;
        }
        return false;
    }

}

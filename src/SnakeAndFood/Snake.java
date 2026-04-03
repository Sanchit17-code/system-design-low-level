package SnakeAndFood;

import java.util.ArrayDeque;
import java.util.Deque;

public class Snake {
    private Coordinate initialPosition;
    private final Deque<Coordinate> snakeCoordinates;
    private int growthFactor = 1;
    private char currentDirection = 'L';

    public Snake(Coordinate initialPosition) {
        this.initialPosition = initialPosition;
        this.snakeCoordinates = new ArrayDeque<Coordinate>();
        this.snakeCoordinates.addFirst(initialPosition);
    }
    public Coordinate nextMoveCoordinate(char direction){
        this.currentDirection = direction;
        Coordinate currentHeadPos = this.snakeCoordinates.peekFirst();
        int x = currentHeadPos.getX();
        int y = currentHeadPos.getY();
        Coordinate coordinate;
        if(direction ==  'L'){
            coordinate = new Coordinate(x,y-1);
        }
        else if(direction == 'R'){
            coordinate = new Coordinate(x,y+1);
        }
        else if(direction== 'U'){
            coordinate = new Coordinate(x-1,y);
        }
        else if(direction == 'D') {
            coordinate = new Coordinate(x+1,y);
        }
        else{
            System.out.println("wrong input of the direction so taking down by default");
            coordinate = new Coordinate(x+1,y);
        }
        return coordinate;
    }
    public void moveHeadForward(Coordinate coordinate){
        this.snakeCoordinates.addFirst(coordinate);
    }
    public void moveOutTail(){
        this.snakeCoordinates.removeLast();
    }

    public Coordinate getInitialPosition() {
        return initialPosition;
    }

    public Deque<Coordinate> getSnakeCoordinates() {
        return snakeCoordinates;
    }

    public int getGrowthFactor() {
        return growthFactor;
    }

    public char getCurrentDirection() {
        return currentDirection;
    }
}

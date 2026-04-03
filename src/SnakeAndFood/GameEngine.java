package SnakeAndFood;

import java.util.Scanner;

public class GameEngine {
    private final Snake snake;
    private final Board board;
    private Food food;
    private final CollisionsCoordinates collisionsCoordinates;
    private volatile char currentDirection = 'L';

    public GameEngine(Coordinate initialPosition, int Length, int Width) {
        this.snake = new Snake(initialPosition);
        this.board = new Board(Length,Width);
        this.collisionsCoordinates = new CollisionsCoordinates(board,snake);
    }

    void play() throws InterruptedException {

        Thread inputThread = new Thread(()->{
            Scanner scanner = new Scanner(System.in);
            while (true){
                char input = scanner.next().charAt(0);
                currentDirection = input;
            }
        });
        inputThread.start();

        food = new Food(this.snake, this.board);
        while(true){
            Coordinate nextCoordinate = this.snake.nextMoveCoordinate(currentDirection);
            boolean isCollisionHappening = this.collisionsCoordinates.isCollisionHappening(nextCoordinate);
            if(isCollisionHappening){
                return;
            }
            if(food.getFoodCoordinate().equals(nextCoordinate)){
                this.snake.moveHeadForward(nextCoordinate);
                food.setFoodCoordinate();
            }
            else{
                this.snake.moveHeadForward(nextCoordinate);
                this.snake.moveOutTail();
            }
            Thread.sleep(1000);
        }
    }


    public Snake getSnake() {
        return snake;
    }

    public Board getBoard() {
        return board;
    }

    public CollisionsCoordinates getCollisionsCoordinates() {
        return collisionsCoordinates;
    }


}

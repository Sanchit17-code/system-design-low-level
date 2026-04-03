package SnakeAndFood;

import java.util.Random;

public class Food {
    private Snake snake;
    private Board board;
    private Coordinate foodCoordinate;

    public Food(Snake snake, Board board) {
        this.snake = snake;
        this.board = board;
        this.setFoodCoordinate();

    }
    public void setFoodCoordinate(){
        while(true) {
            Random random = new Random();
            int x = random.nextInt(this.board.getL());
            int y = random.nextInt(this.board.getW());
            Coordinate coordinate = new Coordinate(x, y);
            if(this.snake.getSnakeCoordinates().contains(coordinate)){
                continue;
            }
            else{
                this.foodCoordinate = coordinate;
                break;
            }
        }
    }

    public Snake getSnake() {
        return snake;
    }

    public Board getBoard() {
        return board;
    }

    public Coordinate getFoodCoordinate() {
        return foodCoordinate;
    }
}

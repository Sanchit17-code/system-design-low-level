package command.Commands;

import command.Chef.Chef;

public class PizzaOrderCommand implements Command{
    private Chef chef;

    public PizzaOrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.preparePizza();
    }

}

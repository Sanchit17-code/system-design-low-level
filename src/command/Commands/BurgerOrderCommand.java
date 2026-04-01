package command.Commands;

import command.Chef.Chef;

public class BurgerOrderCommand implements Command{

    private Chef chef;

    public BurgerOrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.prepareBurger();
    }
}

package command.Chef;

public class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }
    public void preparePizza(){
        System.out.println("pizza is being prepared");
    }
    public void prepareBurger(){
        System.out.println("burger is being prepared");
    }
}

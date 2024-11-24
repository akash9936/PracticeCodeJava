package src.DSA.Decorator_CoffeeMachine;

public class SimpleCoffee implements Coffee{

    @Override
    public String getDesc() {
        return "Simple Coffee ";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}

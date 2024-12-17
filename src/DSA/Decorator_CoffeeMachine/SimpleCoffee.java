package src.DSA.Decorator_CoffeeMachine;

// A simple coffee implementation
public class SimpleCoffee implements Coffee {

    @Override
    public String getDesc() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 5.0; // Base price for a simple coffee
    }
}

package src.DSA.Decorator_CoffeeMachine;

// Abstract Coffee Decorator
public class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Holds the reference to the wrapped Coffee object

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}

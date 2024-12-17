package src.DSA.Decorator_CoffeeMachine;

// Concrete Decorator for adding Cream
public class CreamDecorator extends CoffeeDecorator {

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", Cream Added";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.0; // Additional cost for Cream
    }
}

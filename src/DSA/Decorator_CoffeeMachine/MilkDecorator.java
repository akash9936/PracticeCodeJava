package src.DSA.Decorator_CoffeeMachine;

// Concrete Decorator for adding Milk
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", Milk Added";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.0; // Additional cost for Milk
    }
}

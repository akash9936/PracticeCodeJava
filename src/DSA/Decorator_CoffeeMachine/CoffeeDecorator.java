package src.DSA.Decorator_CoffeeMachine;

public class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;

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

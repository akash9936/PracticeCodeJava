package src.DSA.Decorator_CoffeeMachine;

public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+" , Cream Added";
    }

    public double getPrice(){
        return super.getPrice()+ 3;
    }
}

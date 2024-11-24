package src.DSA.Decorator_CoffeeMachine;

public class MilkDecorator extends CoffeeDecorator{

     public MilkDecorator(Coffee coffee){
         super(coffee);
     }

    @Override
    public String getDesc() {
        return coffee.getDesc()+" ,Added Milk";
    }

    @Override
    public double getPrice() {

         return coffee.getPrice()+ 1.00;
    }
}

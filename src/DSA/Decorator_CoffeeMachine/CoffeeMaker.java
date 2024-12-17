package src.DSA.Decorator_CoffeeMachine;

// Coffee Maker demonstrating the usage of decorators
public class CoffeeMaker {

    public static void main(String args[]) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("Desc: " + myCoffee.getDesc() + " and price is $" + myCoffee.getPrice());

        // Adding Milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("Desc: " + myCoffee.getDesc() + " and price is $" + myCoffee.getPrice());

        // Adding Cream
        myCoffee = new CreamDecorator(myCoffee);
        System.out.println("Desc: " + myCoffee.getDesc() + " and price is $" + myCoffee.getPrice());
    }
}

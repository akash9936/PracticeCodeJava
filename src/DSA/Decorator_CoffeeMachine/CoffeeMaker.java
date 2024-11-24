package src.DSA.Decorator_CoffeeMachine;

public class CoffeeMaker {

    public static void main(String args[]) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("Desc "+myCoffee.getDesc() +" and price is $"+myCoffee.getPrice());
        myCoffee =new MilkDecorator(myCoffee);
        System.out.println("Desc "+myCoffee.getDesc() +" and price is $"+myCoffee.getPrice());
        myCoffee =new CreamDecorator(myCoffee);
        System.out.println("Desc "+myCoffee.getDesc() +" and price is $"+myCoffee.getPrice());
    }


}

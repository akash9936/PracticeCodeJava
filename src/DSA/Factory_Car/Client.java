package src.DSA.Factory_Car;

public class Client {
    public static void main(String args[]){
        CarFactory factory=new CarFactory();
        Car xuvCar=factory.getCar("xuv");
        xuvCar.Assemble();

        Car sedanCar=factory.getCar("Sedan");
        sedanCar.Assemble();

    }
}

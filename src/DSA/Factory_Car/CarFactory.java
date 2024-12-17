package src.DSA.Factory_Car;

public class CarFactory{
    public Car getCar(String carType){
         if(carType==null){
             return null;
         }
         if(carType.equalsIgnoreCase("XUV")){
             return new XUVCar();
         }
         if(carType.equalsIgnoreCase("Sedan")){
             return new SedanCar();
         }
         return null;
    }
}

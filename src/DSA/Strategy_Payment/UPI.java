package src.DSA.Strategy_Payment;

public class UPI implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount+" with UPI");
    }
}

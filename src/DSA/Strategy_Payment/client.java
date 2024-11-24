package src.DSA.Strategy_Payment;

public class client {
    public static void main(String args[]){
      PaymentContext payment=  new PaymentContext(new CreditCardPayment());
      payment.pay(100);

    }
}

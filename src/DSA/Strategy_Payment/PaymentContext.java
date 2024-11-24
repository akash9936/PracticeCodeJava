
package src.DSA.Strategy_Payment;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Constructor to initialize the PaymentContext with a PaymentStrategy
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Setter to change the PaymentStrategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to perform payment using the current strategy
    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount +
                " using card number: " + cardNumber);
        // Actual credit card payment logic here...
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount +
                " for email: " + email);
        // Actual PayPal payment logic here...
    }
}

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardStrategy = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalStrategy = new PayPalPayment("user@example.com");

        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(creditCardStrategy);
        paymentContext.executePayment(100.0);

        paymentContext.setPaymentStrategy(payPalStrategy);
        paymentContext.executePayment(50.0);
    }
}

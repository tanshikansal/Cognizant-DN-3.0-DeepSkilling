interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalGateway {
    void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Actual PayPal payment logic here...
    }
}

class StripeGateway {
    void initiateCharge(double amount) {
        System.out.println("Initiating Stripe charge of $" + amount);
        // Actual Stripe payment logic here...
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypalGateway;

    public PayPalAdapter(PayPalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public void processPayment(double amount) {
        paypalGateway.makePayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.initiateCharge(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PayPalGateway paypalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        PaymentProcessor paypalAdapter = new PayPalAdapter(paypalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        double amount = 100.0;
        paypalAdapter.processPayment(amount);
        stripeAdapter.processPayment(amount);
    }
}

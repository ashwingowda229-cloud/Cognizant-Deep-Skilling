public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext creditCardPayment =
                new PaymentContext(new CreditCardPayment());

        creditCardPayment.executePayment(5000);

        PaymentContext payPalPayment =
                new PaymentContext(new PayPalPayment());

        payPalPayment.executePayment(3000);
    }
}
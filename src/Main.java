//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentStrategy cardPayment = new CreditCard("1111-2222-3333-4444","11/12","123");
        PaymentContext cardContext = new PaymentContext(cardPayment);

        PaymentStrategy paypalPayment = new PayPal("paypal@pay.amount");
        PaymentContext paypalContext = new PaymentContext(paypalPayment);

        PaymentStrategy cashPayment = new CashDelivery();
        PaymentContext cashContext = new PaymentContext(cashPayment);

        cardContext.performPayment(50);
        paypalContext.performPayment(120);
        cashContext.performPayment(850);
    }
}
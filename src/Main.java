//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentStrategy cardPayment = new CreditCard("1111-2222-3333-4444","11/12","123");
        PaymentStrategy paypalPayment = new PayPal("paypal@pay.amount");
        PaymentStrategy cashPayment = new CashDelivery();

        cardPayment.pay(50);
        paypalPayment.pay(120);
        cashPayment.pay(850);
    }
}
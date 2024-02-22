public class CashDelivery implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paiement de " + amount + "€ à la livraison");
    }
}

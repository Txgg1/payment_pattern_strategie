public class CreditCard implements PaymentStrategy{
    private String cardNumber;
    private String expiration;
    private String cvv;

    public CreditCard(String cardNumber,String expiration,String cvv){
        this.cardNumber = cardNumber;
        this.expiration = expiration;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paiement de " + amount + "€ avec la carte de crédit.");
    }
}

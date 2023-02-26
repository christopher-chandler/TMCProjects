public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
       this.balance = openingBalance;
    }

    public String toString() {

        String balanceInfo = String.format("The card has a balance of %s euros", balance);

        return balanceInfo;
    }
    public void addMoney(double amount) {

        double accountBalance = amount +balance;
       if (accountBalance > 150) {
           balance = 150;
       }
       else if (amount > 0 && amount < 150) {
           balance+=amount;
       }
    }

    public void eatAffordably() {

        if (balance >= 2.60 ) {
            balance = balance - 2.60;
        }

    }

    public void eatHeartily() {
        if (balance >= 4.60){
        balance = balance-4.60;
    }

    }


}
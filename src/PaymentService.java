public class PaymentService {

    public void payment(Account person, int cost){
        Bill personBill = person.getAccountBill();
        int finalMoney = personBill.getAmount();

        if (personBill.getAmount() < cost){
            System.out.println("You don't have enough money");
        }else {

            finalMoney -= cost;
            personBill.setAmount(finalMoney);
            person.setAccountBill(personBill);
            System.out.println("You have left: " + finalMoney);
        }
    }
}

public class DepositService {

    public void deposit(Account person, int depositMoney ){
        Bill bill = person.getAccountBill();
        int newMoney = bill.getAmount() + depositMoney;
        bill.setAmount(newMoney);
        person.setAccountBill(bill);
        System.out.println("You have left: "+ bill.getAmount());
    }
}

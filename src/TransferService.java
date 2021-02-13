public class TransferService {

    public void transfer(Account first, Account second, int transferMoney){
        Bill firstAccountMoney = first.getAccountBill();
        int moneyFirstAccount = firstAccountMoney.getAmount();

        if (transferMoney > moneyFirstAccount){
            System.out.println("You don't have enough money");
        }else {
            moneyFirstAccount -= transferMoney;
            Bill secondAccountMoney = second.getAccountBill();
            secondAccountMoney.setAmount(secondAccountMoney.getAmount() + transferMoney);
            firstAccountMoney.setAmount(moneyFirstAccount);
            first.setAccountBill(firstAccountMoney);
            second.setAccountBill(secondAccountMoney);
            System.out.println("You have left: "+ secondAccountMoney.getAmount());
        }
    }
}

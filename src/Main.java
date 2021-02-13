public class Main {

    public static void main(String[] args){
        String firstAccountName = "Name";
        String firstAccountSecondName = "SecName";
        String firstMobilePhone = "+877723";

        String secondAccountName = "Name Second";
        String secondAccountSecondName = "SecName Second";
        String secondAccountMobilePhone = "+2312313";

        Person one = new Person(firstAccountName, firstAccountSecondName, firstMobilePhone);
        Person two = new Person(secondAccountName, secondAccountSecondName, secondAccountMobilePhone);

        Bill firstPersonBill = new Bill(5000);
        Bill secondPersonBill = new Bill(6000);

        Account firstPersonAccount = new Account(one, firstPersonBill);
        Account secondPersonAccount = new Account(two, secondPersonBill);

        PaymentService paymentService = new PaymentService();
        paymentService.payment(firstPersonAccount, 250);
        paymentService.payment(secondPersonAccount, 500);

        DepositService depositService = new DepositService();
        depositService.deposit(firstPersonAccount, 1000);
        depositService.deposit(secondPersonAccount, 1500);

        TransferService transferService = new TransferService();
        transferService.transfer(firstPersonAccount, secondPersonAccount, 5751); // should be false
        transferService.transfer(firstPersonAccount, secondPersonAccount, 5); // should be true




    }
}

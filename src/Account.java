public class Account{

    private Person person;
    private Bill bill;

    public Account(Person person, Bill bill){
        this.person = person;
        this.bill = bill;
    }

    public Person getAccountPerson(Person person){
        return person;
    }

    public Bill getAccountBill() {
        return bill;
    }

    public void setAccountBill(Bill bill){
        this.bill = bill;
    }

    public void setPerson(Person person){
        this.person = person;
    }
}

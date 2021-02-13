public class Person {

    private String namePerson;
    private String secondNamePerson;
    private String numberTelephone;


    public Person(String namePerson, String secondNamePerson, String numberTelephone){
        this.namePerson = namePerson;
        this.secondNamePerson = secondNamePerson;
        this.numberTelephone = numberTelephone;
    }

    String getNamePerson(){
        return this.namePerson;
    }

    String getSecondNamePerson(){
        return this.secondNamePerson;
    }

    String getNumberTelephone(){
        return this.numberTelephone;
    }

    void setNamePerson(String namePerson){
        this.namePerson = namePerson;
    }

    void setSecondNamePerson(String SecondNamePerson){
        this.secondNamePerson = secondNamePerson;
    }

    void setNumberTelephone(String numberTelephone){
        this.numberTelephone = numberTelephone;
    }

}

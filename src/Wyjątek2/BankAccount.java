package Wyjątek2;

public class BankAccount {
    private String number;
    private Person owner;
    private double funds;

    public BankAccount(Person person, String number){
        this.owner = person;
        this.number = number;
    }
    public void deposit(double ammount){
        funds+=ammount;
        }

        public void withdraw(double ammount)throws InsufficientFundsException{
            if(ammount>funds)
                throw new InsufficientFundsException("Niewłaściwa ilość środków na koncie");
            else
                funds-=ammount;
    }
public double getFunds(){
    return funds;
}
}

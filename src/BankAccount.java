class BankAccount {
    String holder_name;
    int account_number;
    double balance;

    BankAccount(){
        holder_name="UnKnown";
        account_number=0;
        balance=0.0;
    }

    BankAccount(String name,int number,double bal){
    holder_name=name;
    account_number=number;
    balance=bal;
    }
    void display(){
        System.out.println(holder_name);
        System.out.println(account_number);
        System.out.println(balance);
        System.out.println("---------------------------------------------------");
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.display();

        BankAccount acc2 = new BankAccount("purplecat",12345,1000.00);
        acc2.display();
    }
}

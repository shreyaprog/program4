public class bankAccount_demo
{
     public static void main(String args[])
        {
        bankAccount acc1=new bankAccount();
        acc1.initialize("Chetan",22000,"Saving",7885);
        bankAccount acc2=new bankAccount("Sia",60000,"current",10000);
        acc1.deposit(15000);
        acc1.display();
        acc2.deposit(20000);
        acc2.display();
    }
}
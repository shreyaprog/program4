public class bankAccount
{
   String DepositorName;
   long accountnumber;
   String Accounttype;
   int Balanceamount;
   public bankAccount()
   {
    DepositorName=(" ");
    accountnumber=0;
    Accounttype=(" ");
    Balanceamount=-1;
}
 public bankAccount(String dname,long acc_num,String acc_type,int balance_amt)
 {
      DepositorName=dname;
      accountnumber=acc_num;
      Accounttype=acc_type;
      Balanceamount=balance_amt;
    }
     public void initialize(String dname,long acc_num,String acc_type,int balance_amt)
 {
      DepositorName=dname;
      accountnumber=acc_num;
      Accounttype=acc_type;
      Balanceamount=balance_amt;
    }
    public void display()
    {
      System.out.println(DepositorName);
      System.out.println(accountnumber);
      System.out.println(Accounttype);
      System.out.println(Balanceamount);
    }
    public void deposit(double amount)
    {
        Balanceamount+=amount;
    }
    public void withdrawAccount(double amount)
    {
       if(amount<=Balanceamount)
       Balanceamount-=amount;
    }
}
    
    
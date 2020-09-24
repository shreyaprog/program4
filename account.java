public class account
{
    double balance;
    account()
    {
        balance=0;
    }
    void startAccount(double amt)
    {
        balance=amt;
    }
    void depositAccount(double amount)
    {
        balance+=amount;
    }
    double withdrawAccount(double amount)
    {
        balance-=amount;
        return amount;
    }
    double getBalance()
    {
        return balance;
    }
   }
 class accountDemo
    {
        public static void main(String args[])
        {
        account my_acc=new account();
        my_acc.startAccount(22000);
        my_acc.depositAccount(200.0);
        System.out.println("Current Balance");
        my_acc.withdrawAccount(100.0);
        System.out.println("Remaining Balance");
    }
}

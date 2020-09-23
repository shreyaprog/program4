import java.util.Scanner;
public class prime_num
{
  int n;
  int num;
void init()
  {
      Scanner sc =new Scanner(System.in);
      n=num;
      n=sc.nextInt();
    }
    void input()
    {
        System.out.println("enter a number(10...100)");
    }
    void calc()
    {
        if (n%1==0 && n%n==0)
        System.out.println("prime no");
        else
        System.out.println("not a prime no");
    }
    public static void main(String args[])
    {
    prime_num obj=new prime_num();
    obj.init();
    obj.input();
    obj.calc();
}
}   
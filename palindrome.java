import java.util.Scanner;
public class palindrome
{
    int n;
    int digit;
    int rev;
    int num;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        int n=num;
        int rev=0;
        digit=1;
        n=sc.nextInt();
    }
    void calc()
    {
        while(n!=0)
        {
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
}
    void check()
    {
    if (rev==n)
    System.out.println("palindrome no");
    else
    System.out.println("not a palindrome no");
}
public static void main(String args[])
{
palindrome obj=new palindrome();
obj.getData();
obj.calc();
obj.check();
}
}

    
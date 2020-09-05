import java.util.Scanner;
class ReverseN
{
    public void rev()
    {
        int n,reverse=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=in.nextInt();
        while(n!=0)
        {
            reverse =reverse*10;
            reverse=reverse+n%10;
            n=n/10;
        }
        System.out.println("Reverse of the number is"+reverse);
    }
}
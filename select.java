import java.util.Scanner; 
public class select
{
    public  void test ()
    {
      Scanner inp=new Scanner(System .in);
      int num=0;
        {
        System.out.println("Enter a number(1..99):");
        num=inp.nextInt();
        if (num>0&&num<10)
        System.out.println("the number is single digit number");
        else
        System.out.println("the number is double digit number");
    }
}
}
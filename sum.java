public class sum
{
    public static void main()
    {
        int sum=0;
        for(int i =1;i<10;i+=2)
        sum+=(i*i*i);
        System.out.println("sum of cube of odd numbers between 1...10"+sum);
    }
}
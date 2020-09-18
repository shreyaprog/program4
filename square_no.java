public class square_no
{
    double ans;
    double n1;
    double result;
    void init(int num1)
    {
    n1=num1;
    
}
    void calc()
    {
       ans=n1*n1;
       
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
    square_no obj=new square_no();
    obj.calc();
    obj.display();
}
}
public class square_no
{
    int num1;
    int ans;
    void init(int n1)
    {
        num1=n1;
        
    }
    void calc()
    {
        ans=num1*num1;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        square_no obj=new square_no();
        obj.init(2);
        obj.calc();
        obj.display();
    }
}
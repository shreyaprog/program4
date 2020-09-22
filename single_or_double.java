public class single_or_double
{
    int num;
    void init()
    {
        num=4;
    }
    void input()
    {
        System.out.println("Enter a number(1...99)");
    }
    void display()
    {
       if(num>=0 && num<=10)
        System.out.println("Single digit");
        else
        System.out.println("double digit");
    }
    public static void main()
    {
    single_or_double obj=new single_or_double();
    obj.init();
    obj.input();
    obj.display();
}
}
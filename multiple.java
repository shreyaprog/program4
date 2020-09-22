public class multiple
{
    int n;
    void init(int num)
    {
        n=num;
    }
    void display()
    {
        if (n%3==0 && n%5==0)
        System.out.println("multiple of 3 and 5");
        else if(n%3!=0&&n%5!=0)
        System.out.println("not multiple of 3 and 5");
    }
    public static void main(String args[])
    {
    multiple obj=new multiple();
    obj.init(15);
    obj.display();
}
}
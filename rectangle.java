public class rectangle
{
    int len;
    int breadth;
    int area;
    int per;
    void init(int l,int b)
    {
        len=l;
        breadth=b;
    }
    void calc()
    {
        area=len*breadth;
        per=2*(len+breadth);
    }
    void display()
    {
        System.out.println("area");
        System.out.println("per");
    }
    public static void main(String args[])
    {
        rectangle obj=new rectangle();
        obj.init(7,5);
        obj.calc();
        obj.display();
    }
}
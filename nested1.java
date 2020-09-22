
public class nested1
{
    int i,j;
    void input()
    {
    for(i=1;i<=4;++i);
    for(j=1;j<=4;++j);
    System.out.println(j+" ");
}
void display()
{
    System.out.println();
}
public static void main()
{
nested1 obj=new nested1();
obj.input();
obj.display();
}
}
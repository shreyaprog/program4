import java.util.Scanner;
class pattern1
{
    int n;
    void getData()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number or rows for the pattern");
    n=sc.nextInt();
}
void generatePattern()
{
 for(int i=1;i<=n;i++)
 {
for(int j=1;j<=i;j++)
System.out.print(""+1);
System.out.println();
}
}
public static void main()
{
pattern1 obj=new pattern1();
obj.getData();
obj.generatePattern();
}
}   
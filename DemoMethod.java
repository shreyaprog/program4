public class DemoMethod
{
    public void DemoMethodTest()
    {
        int x=85;
        int y=26;
        int z=DemoMethod.maximum(x,y);
        System.out.println("the larger one is"+z);
    }
    public static int maximum(int a,int b)
    {
        int ans;
        ans=(a>b)?a:b;
        return ans;
    }
}
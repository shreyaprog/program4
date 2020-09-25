public class overload_volume
{ 
    double V;
   double volume(double R)//volume of sphere
    {
    V=4.0/3*22/7*(R*R*R);
     return V;
    }
    double volume(double H,double R)//volume of cylinder
    {
        V=22.0/7*(R*R)*H;
    return V;
    }
    double volume(double L,double B,double H)//volume of cuboid
    {
        V=L*B*H;
        return V;
    }
    public static void main()
    {
    overload_volume obj=new overload_volume();
    obj. volume(5);
    obj. volume(8,5);
    obj. volume(2,7,8);
}
}
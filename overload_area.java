public class overload_area
{
    double area;
    double s;
    int height;
    double area(double a,double b,double c)//area of scalene triangle
    {
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    double area(double a,double b,int height)//area of trapezium
    {   
        
        area=1/2*height*(a+b);
        return area;
    }
    double area(double diagonal1,double diagonal2)//area of rohmbus
    {
        area=1/2*diagonal1*diagonal2;
        return area;
    }
    public static void main()
    {
    overload_area obj=new overload_area();
    obj. area(3,9,5);
    obj. area(3,9,6);
    obj. area(2,7);
}
}
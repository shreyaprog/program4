class Circle
{
    double area,radius;
    void init(double r)
    {
        radius=r;
    }
    double calc()
    {
        area=radius*3.14*radius;
        return area;
    }
    public static void main()
    {
        Circle obj=new Circle();
        obj.init(10.5);
        double result=obj.calc();
        System.out.println(result);
    }
}
       
        
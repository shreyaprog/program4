public class eligibility
{
    int total_classes;
    double classes_att;
    double att_per;
    void init()
    {
    total_classes=500;
}
void calc()
{
    att_per=classes_att/total_classes*100;
}
void display()
{
    if(att_per>75.0)
    System.out.println("Eligible to take exams");
    else
    System.out.println("Not eligible to take exams");
}
public static void main()
{
    eligibility obj=new eligibility();
    obj.init();
    obj.calc();
    obj.display();
}
}
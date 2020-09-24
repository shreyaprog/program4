public class showroom
{ 
    String name;long mobno; double cost,dis,amount;
    public void ShowRoom()
    {
        name=" ";
        mobno=0L;
        cost=0.0;
    }
    void input(String Name, long Mobile_no,double Cost)
    {
        String name=Name;
        long mobno=Mobile_no;
        double cost=Cost;
    }
    void calculate()
    {
        if(cost<= 10000)
        { 
            dis=(5*cost)/100.0;
            amount= cost-dis;
        }
       else if(cost>10000 && cost<=20000)
        {
            dis=(10*cost)/100.0;
            amount= cost-dis;
        }
        else if(cost>20000 && cost<=35000)
        { 
            dis=(15*cost)/100.0;
            amount= cost-dis;
        }
        else if(cost>35000)
        { 
            dis=(20*cost)/100.0;
            amount= cost-dis;
        }
    }
    void display()
    {
        System.out.println( name);
        System.out.println( mobno);
        System.out.println( amount);
    }
    public static void main()
    { 
        showroom obj= new showroom();
        obj.input("a",5352888851,35000.0);
        obj.calculate();
        obj.display();
    }
    }
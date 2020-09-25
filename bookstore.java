public class bookstore
{
    public static void main(String args[])
    {
        book book1=new book("tech01","Stories",120.0);
        System.out.println(book1);
        System.out.println("code:"+book1.getCode()+"title:"+book1.getTitle()+"price:"+book1.getPrice());
    }
}

public class OrderApp
{
    public static void main(String[] args)
    {
        Order o1=new Order(1,"rameshwor",70000);
        PremiumOrder p1=new PremiumOrder(5,"king",900000);
        NormalOrder n1=new NormalOrder(6,"Aalish",60000);
        System.out.println(p1);
        System.out.println(n1);
        System.out.println("Amount on normal order with discount: "+n1.calculateAmount(10000));;
    }
}
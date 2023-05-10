public class DemoRun
{
    int i,j;
    {
        System.out.println("non static block");
        i=10;
        j=20;
    }
    public static void main(String[]args)
    {
        DemoRun ns1=new DemoRun();
        System.out.println(ns1.i);
        System.out.println(ns1.j);
    
    }
}
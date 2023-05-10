class constructor
{
    int i,j;
    static int x,y;
    constructor()
    {
        System.out.println("I am constructor");
    }
    static
    {
        System.out.println("I am static block of costructor class");
    }
    {
        System.out.println("I am non static block of constructor class");
    }
}
public class DemoRun
{
    static
    {
        System.out.println("I am static block of DemoRun class");
    }
    {
        System.out.println("I am non static block of DemoRun class");
    }
    public static void main(String[]args)
    {
        System.out.println("main starts");
        constructor c1=new constructor();
        constructor c2=new constructor();
        new DemoRun();
        System.out.println("main end");
    }
    }
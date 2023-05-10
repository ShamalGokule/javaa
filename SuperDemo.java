
class Base
{
   public int A;

  public Base()
   {
    System.out.println("Inside Base  default Constructor");
    this.A=11;
   
   }
   public Base(int i)
   {
    System.out.println("Inside Base  parameterised Constructor");
    this.A=i;
   
   }

  public void fun()
   {
    System.out.println("Inside Base fun");
    }
}
class Derived extends Base         //class Derived:public Base
{
public int X;
public Derived()
{
    super(11);
    System.out.println("Inside Derived constructor");
    this.X=51;
}
public void gun()
{
    System.out.println("Inside  Derived gun");
    System.out.println("value of A:"+super.A);
    super.fun();
}
}
class SuperDemo
{
    public static void main(String Arg[])
    {
     Derived dobj=new Derived();
     dobj.gun();

     
    

    }
}




// 1.Access data of parent from child
//2.call method of parent from child
//3.call constructor of parent from child
class Base
{
   public int A;
   public int B;

  public Base()
   {
    System.out.println("Inside Base Constructor");
    this.A=11;
    this.B=21;
   }

  public void fun()
   {
    System.out.println("Inside Base fun");
    }
}
class Derived extends Base         //class Derived:public Base
{
public int X;
public int Y;
public Derived()
{
    System.out.println("Inside Derived constructor");
    this.X=51;
    this.Y=101;
}
public void gun()
{
    System.out.println("Inside  Derived gun");
}
}
class DerivedX extends Base
{
    public int Z;
    public DerivedX()
    {
        System.out.println("inside DerivedX constructor");
        this.Z=111;
    }
}

class Hierarchal
{
    public static void main(String Arg[])
    {
     DerivedX dobj=new DerivedX();
     dobj.fun();
     

     System.out.println(dobj.A);
     System.out.println(dobj.B);
  
     System.out.println(dobj.Z);
    }
}
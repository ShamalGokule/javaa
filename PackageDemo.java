import marvellous.Arithmatic;
import Marvellous.Mathematics;

class PackageDemo
{
    public static void main(String Arg[])
    {
        Arithmatic aobj=new Arithmatic();
        Mathematics mobj=new Mathematics();
        int iRet=0;

        iRet=aobj.Addition(10,11);
        System.out.println("Addition is:"+iRet);

          iRet=aobj.Substraction(10,11);
        System.out.println("Substraction is:"+iRet);

          iRet=aobj.Square(10,11);
        System.out.println("Square is:"+iRet);

          iRet=aobj.Cube(10,11);
        System.out.println("Cube is:"+iRet);

      
    }
}
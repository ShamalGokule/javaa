import java.util.*;

class ArrayFor
{
    public static void main(String Args[])
    {
    Scanner sobj=new Scanner(System.in);

    System.out.println("Enter the size of arry:");
    int isize=sobj.nextInt();

    int Arr[]=new int[isize];

    System.out.println("enter the elements:");
    Arr[0]=sobj.nextInt();
    Arr[1]=sobj.nextInt();
    Arr[2]=sobj.nextInt();
    Arr[3]=sobj.nextInt();

   
    System.out.println(Arr[0]);
     System.out.println(Arr[1]);
      System.out.println(Arr[2]);
       System.out.println(Arr[3]);

    }
}
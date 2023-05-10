import java.util.*;

class ArrayFor1
{
    public static void main(String Args[])
    {
    Scanner sobj=new Scanner(System.in);

    System.out.println("Enter the size of arry:");
    int isize=sobj.nextInt();

    int Arr[]=new int[isize];

    System.out.println("enter the elements:");
    int iCnt=0;
    for(iCnt=0;iCnt< isize;iCnt++)
    {
     Arr[iCnt]=sobj.nextInt();
    }
   System.out.println("Element of array are:");
   for(iCnt=0;iCnt< isize;iCnt++)
   {
    System.out.println(Arr[iCnt]);
   }
  

    }
}
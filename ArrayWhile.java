import java.util.*;

class ArrayWhile
{
    public static void main(String Args[])
    {
    Scanner sobj=new Scanner(System.in);

    System.out.println("Enter the size of arry:");
    int iSize=sobj.nextInt();

    int Arr[]=new int[iSize];

    System.out.println("enter the elements:");
    int iCnt=0;
    while(iCnt<iSize)
    {
     Arr[iCnt]=sobj.nextInt();
     iCnt++;
    }
   System.out.println("Element of array are:");
  while(iCnt<iSize)
   {
    System.out.println(Arr[iCnt]);
    iCnt++;
   }
  

    }
}
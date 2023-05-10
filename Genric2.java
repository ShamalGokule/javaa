class Genric2
{
    public static <T> void Display(T Arr[])
    {
      for(T no:Arr)
      {
        System.out.println(no);
      }
      /*for(int i=0;i<Arr.lenth;i++)
      {
        Sysem.out.println(Arr[i]);
      }*/
    }
    public static void main(String Arg[])
    {
     Integer A[]={10,20,30,40};
     Float  B[]={50.65f,60.75f,70.54f};
     Double C[]={50.45,60.65,70.65};


     Display (A);
     Display (B);
     Display (C);
    }
}
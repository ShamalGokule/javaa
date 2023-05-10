import java.util.*;

class HashTable
{
    public static void main(String arg[])
    {
        HashTable<String,Integer>hobj = new HashTable<String ,Integer>();

        hobj.put("C Programming",990);
        hobj.put("C++ Programming",1200);
        hobj.put("Java Programming",780);
        hobj.put("Python Programming",1650);
            

            System.out.println("Book price of java"+hobj.get("Java Programming"));
            hobj.remove("C++ Programming");

            Enumeration eobj=hobj.keys();
            while(eobj.hasMoreElements())
            {
                System.out.println(eobj.nextElement());
            }

    }
}


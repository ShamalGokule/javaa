public class method1
{
public static void main(String[]args)
{
String s1=new String("Hello");
String s2="Hello";
System.out.println(s1==s2);
String s3="Hello";
System.out.println(s2==s3);
String s4=new String("Hello");
System.out.println(s1==s4);
System.out.println(s1.equals(s4));
System.out.println(s2.equals(s3));
System.out.println(s1.equals(s2));
}
}
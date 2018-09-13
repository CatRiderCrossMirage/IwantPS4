import java.util.*;
public class Iwantps4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String x = sc.nextLine();
    String y = sc.nextLine();
    String z = sc.nextLine();
    int a = x.length();
    int b = y.length();
    int c = z.length();
    if(a<b && b<c)
    { System.out.println(x);
      System.out.println(y);
      System.out.println(z); }
    else if(c<b && b<a)
    { System.out.println(z);
      System.out.println(y);
      System.out.println(x); }
    else if(b<a && a<c)
    { System.out.println(y);
      System.out.println(x);
      System.out.println(z); }
    else if(a<c && c<b)
      { System.out.println(x);
        System.out.println(z);
        System.out.println(y); }
    else if(c<a && a<b)
      { System.out.println(z);
        System.out.println(x);
        System.out.println(y); }
    else if(b<c && c<a)
      { System.out.println(y);
        System.out.println(z);
        System.out.println(x); }
  }
}

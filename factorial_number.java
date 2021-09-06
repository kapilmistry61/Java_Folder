import java.util.*;
class A{
  A()
  {
    System.out.println("enter the Number");
    int fact=1;
    Scanner s1=new Scanner(System.in);
    int n=s1.nextInt();
    
    for(int i=1; i<=n; i++)
    {
      fact=fact*i;
    }
    System.out.println("factorial number is ="+fact);
  }
  public static void main(String[] args) {
    A s1=new A();
  }
}

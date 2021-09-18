import java.util.*;  

class A{
  A()
  {
    System.out.println("enter the number");
    Scanner sc= new Scanner(System.in);

    int n= sc.nextInt(); 
    if(n%2==0)
    {
      System.out.println("even number");
    }else
    {
      System.out.println("odd number");
    }
  }
  public static void main(String[] args) {
      A s1=new A();
  }
}

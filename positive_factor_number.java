import java.util.Scanner;
class A{
  public static void main(String[] args) {
    System.out.println("enter number");
    Scanner insert=new Scanner(System.in);
    int n=insert.nextInt();
    System.out.print("factor number of "+n+" is = "+n);
    
    for(int i=2; i<=24; i++)
    {
    if(n%i==0)
    {
      System.out.print(","+(n/i));
    } 
    }
  }
}

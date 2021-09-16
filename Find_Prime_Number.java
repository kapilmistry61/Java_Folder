import java.util.Scanner;
class A{
  public static void main(String[] args) {
    System.out.println("enter number");
    Scanner insert=new Scanner(System.in);
    int num=insert.nextInt();

    System.out.print(num+" is");
    //first finding factor numbers of given number
    if(num > 1)
    {
      for(int i=2; i<=1000; i++)
    {
    if(num%i==0)
    {
      int data=num/i;
      if(data > 1)
      {
        System.out.println(" not prime number");
        break;
      }else
      {
        System.out.println(" prime number");
        break;
      }
    } 
    }
    }
    if(num <= 1)
    {
      System.out.println(" not prime number");
    }
  }
}

import java.util.Scanner;
class A{
  public static void main(String[] args) {
    System.out.println("enter number ");
    Scanner insert=new Scanner(System.in);
    int num=insert.nextInt();

    if(num == 1)
    {
      System.out.println(num+ " is prime");
    }

    if(num > 1)
    {
      for(int i=2; i<=num; i++)
    {
      if(num%i == 0 )
      {
        int data=i;

        if(data < num)
        {
          System.out.println(num+" is not prime");
          break;
        }else
        {
          System.out.println(num+" is prime");
        }
      }
     }
    }
  }
}
}

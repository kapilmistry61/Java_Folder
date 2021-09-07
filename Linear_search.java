import java.util.*;
class A{
    public static void main(String[] args) {
        System.out.println("enter the mumber");
        Scanner insert=new Scanner(System.in);
        int num=insert.nextInt();

        System.out.println("enter "+num+" integer");
        int array[]=new int[num];

        int counter;
        for(counter =0; counter<num; counter++)
        {
            array[counter]=insert.nextInt();
        }
        System.out.println("search the value");
        int item=insert.nextInt();

        for(counter =0; counter<num; counter++)
        {
            if(item==array[counter])
            {
                System.out.println(item+" is present at location "+(counter+1));
                break;
            }
        }
        if(num==counter)
        {
            System.out.println(item+" is not present in array");
        }
    }
}

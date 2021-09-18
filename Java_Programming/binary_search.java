import java.util.*;
class A{
    public static void main(String[] args) {
        System.out.println("enter the number");

        Scanner insert=new Scanner(System.in);
        int num=insert.nextInt();

        int array[]=new int[num];

        System.out.println("enter "+num+" integer");
        for(int counter=0; counter< num; counter++)
        array[counter]=insert.nextInt();

        System.out.println("enter search value");
        int item=insert.nextInt();

        int first=0;
        int last=num-1;
        int middle=(first+last)/2;
        while(first <= last)
        {
            if(array[middle] > item)
            {
                first = middle + 1;
            }
            else if(array[middle] == item)
            {
                System.out.println(item+" is available at "+(middle+1));
                break;
            }
            else
            {
                last =middle - 1;
            }
            middle = (first+last)/2;
        }

        if(first > last)
        {
            System.out.println("number is not available");
        }
    }
}

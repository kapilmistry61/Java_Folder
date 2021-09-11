import java.util.*;
public class A{
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<Integer>();
        alist.add(10);
        alist.add(90);
        alist.add(70); 
        alist.add(40);
        alist.add(50);

        Iterator itr=alist.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(" printing in reverse order");

        Comparator cmp=Collections.reverseOrder();
        Collections.sort(alist, cmp);
        Iterator itr2=alist.iterator();

        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
    }
}

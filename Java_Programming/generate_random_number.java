import java.util.*;
class A{
    public static void main(String[] args) {
        Random rno= new Random();
        for(int i=0; i<=5; i++)
        {
            System.out.println(rno.nextInt(200));
        } 
    }
}

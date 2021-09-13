public class A{
    public static void main(String[] args) {
        for(int i=0; i<=8; i++)
        {
            for(int j=2-1; j<=i; j++)
            {
                System.out.print(" ");
            }

            for(int k=1+i; k<=9; k++ )
            {
                System.out.print(k+" ");
            }
            
            System.out.println();
        }

        System.out.print("");

        for(int i=8; i>=1; i--)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int k=0+i; k<=9; k++)
            {
                System.out.print(k+" ");
            }    
            System.out.println();
        }
    }
}
/*output

1 2 3 4 5 6 7 8 9 
 2 3 4 5 6 7 8 9 
  3 4 5 6 7 8 9 
   4 5 6 7 8 9 
    5 6 7 8 9 
     6 7 8 9 
      7 8 9 
       8 9 
        9 
       8 9 
      7 8 9 
     6 7 8 9 
    5 6 7 8 9 
   4 5 6 7 8 9 
  3 4 5 6 7 8 9 
 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 

*/

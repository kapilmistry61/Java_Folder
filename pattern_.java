class Pattern{
    public static void main(String[] args) {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int k=5; k>=i; k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int r=1; r<=4; r++)
        {
            for(int c=1; c<=r; c++)
            {
                System.out.print(" ");
            }
            for(int l=5; l>r; l--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* output
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/


class A{
    public static void main(String[] args) {
        //printing rows
        for(int i=9; i>=1; i--)
        {
            //printing left part 
            for(int j=i; j>=1; j--)
            {
                if(i==6)
                {
                    continue;
                }
                System.out.print(i);
            }
            //printing middle part 
            for(int k=i-1; k<=7; k++)
            {
                if(i==6)
                {
                    continue;
                }
                System.out.print("  ");
            }
            //printing right part 
            for(int m=i; m>=1; m--)
            {
                if(i==6)
                {
                    continue;
                }
                System.out.print(i);
            }
            if(i != 6)
            System.out.println();
        }
    }
}
/* output
999999999999999999
88888888  88888888
7777777    7777777
55555        55555
4444          4444
333            333
22              22
1                1
*/

class A{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println("original array ");
        for(int i=1; i<=arr.length; i++)
        {
            System.out.print(i);
        }

        System.out.println();

        System.out.println("output pattarn like this ");
        for(int k=1; k<=3; k++)
        {
            System.out.print(k);
        }
        for(int j=arr.length; j>=4; j--)
        {
            System.out.print(j);
        }
    }
}
/*OUTPUT
original array 
12345678910
output pattarn like this 
12310987654
*/

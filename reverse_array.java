class A{
 public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7,8,9,10};

        for(int a:arr)
        {
            if(a >3)
            {
                break;
            }
            System.out.print(a);
        }     
        for(int j=arr.length; j>=4; j--)
        {
            System.out.print(j);
        }    
  }
}

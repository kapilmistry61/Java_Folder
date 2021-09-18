public class PingPong implements Runnable
{
    String word;
    PingPong(String s)
    {  
           word = s;
    }

    public void run()
    {
      try{
             for(int  i = 0; i<30; i++)
              {
                  System.out.println(word);
                  Thread.sleep(100) ;
               }
         }catch (InterruptedException e)
         { e.printStackTrace(); }
    }
    public static void main(String[] args)
    { 
        Runnable p1 =  new PingPong("ping");
        Thread   t1 = new Thread(p1);
         t1.start();
         //start another thread;
        Runnable p2 = new PingPong("pong");
        Thread t2 = new Thread(p2);
        t2.start();
    }
}

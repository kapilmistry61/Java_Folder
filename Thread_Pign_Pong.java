class PingPongThread implements Runnable{
  private Object lock_object;
  private  String name; 

  PingPongThread(Object lock_object, String name)
  {
    this.lock_object=lock_object;
    this.name=name;
  }
  
  public void run()
  {
    synchronized(lock_object)
    {
      while(true){
             System.out.println(name);
        try{
          Thread.sleep(1000);
       
        }catch(Exception e)
        {
            e.toString();
        }
        lock_object.notify();

        try{
          lock_object.wait(1000);
          
        }catch(Exception d)
        {
            d.toString();
        }
      }
    }
  }
}
public class PingPong{
  public static void main(String[] args) {
  Object lock_object=new Object();
  Thread ping=new Thread(new PingPongThread(lock_object, "ping"));
  Thread pong=new Thread(new PingPongThread(lock_object, "pong"));
  ping.start();
  pong.start();  
  }
}

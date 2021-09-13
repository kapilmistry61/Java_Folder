class Count extends Thread{
    Count()
    {
        System.out.println("Thread is starting");
        start();
    }

    public void run()
    {
        try{
            for(int i=0; i<=10; i++)
            {
                System.out.println("count is printing = "+i);
                Thread.sleep(1000);
            }
        }catch(Exception d)
        {
            System.out.println("Interrupted");
        }
        System.out.println("my thread is run over");
    }
}
class Test{
    public static void main(String[] args) {
        Count cnt=new Count();

        try{
        while(cnt.isAlive())
        {
            System.out.println("thread will be alive till the child thread is live");
            Thread.sleep(1500);
        }
        }catch(Exception c)
        {
            System.out.println("Interrupted");
        }
        System.out.println("main thread is run over");
    }
}

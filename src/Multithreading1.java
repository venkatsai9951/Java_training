class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }
        catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}

class MultithreadingDemo1 implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }
        catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++)
        {
            MultithreadingDemo obj=new MultithreadingDemo();
            obj.start();
            Thread obj1=new Thread(new MultithreadingDemo1());
            obj1.start();
        }
    }
}

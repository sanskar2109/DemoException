//how to create multithread applicaation
class Mythread67 extends Thread
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("MYthread67"+i);
        }
    }
}
public class Demoexception
{
    public static void main(String[] args)
    {
     Mythread67 obj= new Mythread67();
     Thread obj1 = Thread.currentThread();
     obj1.setPriority(Thread.MAX_PRIORITY);
     System.out.println(obj1.getPriority());
     obj1.setName("Thread-0");
     System.out.println(obj1.isAlive());
     System.out.println(obj1.isDaemon());
     System.out.println(10/0);
     obj.start();
        for (int i=0;i<10;i++)
        {
            System.out.println("Main thread67"+i);
        }
    }
}

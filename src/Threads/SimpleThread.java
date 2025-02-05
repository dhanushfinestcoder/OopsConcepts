package Threads;


//class A extends  Thread
//{
//    public void run()
//    {
//        for(int i=0;i<=100;i++)
//        {
//            System.out.println("Rcb");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class B extends  Thread
//{
//    public void run()
//    {
//        for(int i=0;i<=100;i++)
//        {
//            System.out.println("Csk");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

class Rcb implements Runnable
{
 public  void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Esalaa");
        }
    }
}
class Csk implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++) {
            System.out.println("Manjaa mankan");
        }
    }
}
public class SimpleThread
{
    // The dividing of tasks into small unit is known as threads in the same tasks we can have  multiple threads for example if we are using the notpad while typing it shows eero has ine thread and suggestion is another thread
    //It is light weight
    //Multiple threads can share resources if we want to run the behaviour simulatneously we can use threads
   // priority is used to tel the cpu which one to take 1 means min 10 means max 5 means default
    //Implementation we have extends the thread class and create obj for that class
    // sleep is tell the process to take rest for some time in that time other process happpens



    // Runnable interface
    //Create a class and implements runnable interface


    public static void main(String[] args) {
//        A o1=new A();
//        B o2=new B();
//       System.out.println(o1.getPriority());
//        o1.start();
//        o2.start();
        Runnable o1=new Rcb();
        Runnable o2=new Csk();

        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);
        t1.start();
        t2.start();



    }
}

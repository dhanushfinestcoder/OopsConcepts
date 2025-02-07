package MemoryManagement;


import java.lang.ref.WeakReference;

public class MemMgt
{
    public static void main(String[] args)
    {
          String strongRef=new String("Dhanush");
          System.gc();
          WeakReference<String>wr=new WeakReference<>(strongRef);
          System.out.println(wr.get());
          strongRef=null;
          System.gc();

          System.out.println(wr.get());
    }
}

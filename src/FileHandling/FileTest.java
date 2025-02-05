package FileHandling;

import java.io.*;

public class FileTest
{
    public static void main(String[] args) throws Exception {
        BufferedReader br=null;
        BufferedWriter bw=null;
        try
        {
            bw=new BufferedWriter(new FileWriter("/home/dell/demo.txt"));
            bw.append("Hello Dhanush");
            bw.newLine();
            bw.append("This is working");
            bw.flush();
            br=new BufferedReader(new FileReader("/home/dell/demo.txt"));
            String l;
           while((l=br.readLine())!=null)
           {
               System.out.println(l);
           }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            bw.close();
        }
    }
}

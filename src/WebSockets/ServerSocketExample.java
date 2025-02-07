package WebSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketExample
{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8080);
        Socket socket=serverSocket.accept();
         DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
//        dataOutputStream.writeUTF("Hii Client");
//        dataOutputStream.flush();
         DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
//        String reply=dataInputStream.readUTF();
//        System.out.println("The Mesage from client :"+reply);
          Scanner d=new Scanner(System.in);
          String str="";
           while(!(str.equals("end")))
           {
               System.out.println("Enter Server Message");
               str=d.nextLine();
               dataOutputStream.writeUTF(str);
               dataOutputStream.flush();
               String rep=dataInputStream.readUTF();
               System.out.println("The Message From Client :"+rep);
           }

    }
}

package WebSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketEXample
{
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",8080);
        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        Scanner d=new Scanner(System.in);
        String st="";
        while(!(st.equals("end")))
        {
            String rep=dataInputStream.readUTF();
            System.out.println("The Message From Server "+rep);
            System.out.println("Enter Client Message ");
            st=d.nextLine();
            dataOutputStream.writeUTF(st);
            dataOutputStream.flush();
        }

//        System.out.println("The Message From Server"+str);
//        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
//        dataOutputStream.writeUTF("Message From Client");

    }
}

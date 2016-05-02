import java.net.*;
import java.io.*;

public class SocketCliente
 {
     public static void main (String [] args)
     {
         new SocketCliente();
     }
     
     public SocketCliente()
     {
         try
         {
             Socket socket = new Socket ("localhost", 35557);
             System.out.println ("conectado");                          
             DataOutputStream bufferW = new DataOutputStream (socket.getOutputStream());
             DataInputStream bufferR = new DataInputStream (socket.getInputStream());            
             System.out.println ("Recibido " + bufferR.readUTF());			 
			 bufferW.writeUTF ("Hola Servidor :)S !!!");			 
			 socket.close();   
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }
}

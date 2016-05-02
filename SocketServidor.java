import java.net.*;
import java.io.*;

public class SocketServidor
{    
    public static void main (String [] args)
    {
        new SocketServidor();
    }
    
    public SocketServidor()
    {
        try
        {
            ServerSocket socket = new ServerSocket (35557);            
            System.out.println ("Esperando cliente");
            Socket cliente = socket.accept();
            System.out.println ("Conectado con cliente de " + cliente.getInetAddress());            
            DataOutputStream bufferW = new DataOutputStream (cliente.getOutputStream());
            DataInputStream bufferR = new DataInputStream (cliente.getInputStream());            
            bufferW.writeUTF ("Hola cliente :D !!!");                        
            System.out.println ("Recibido " + bufferR.readUTF());            
            cliente.close();            
            socket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

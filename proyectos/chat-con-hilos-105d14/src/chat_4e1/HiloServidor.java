/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_4e1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author roafi
 */
public class HiloServidor implements Runnable{
    private DatagramPacket dp;
    private DatagramSocket ds;
    private InetAddress ip;
    private int puerto;
    private Cliente interfaz;
    private boolean activo;
    private byte[] mensaje;

    public HiloServidor(Cliente interfaz) {
        this.interfaz=interfaz;
        activo=true;
        Thread hilo=new Thread(this);
        hilo.start();
    }
    
    public void setActivo(boolean activo)
    {
        this.activo=activo;
    }
    
    @Override
    public void run() {
        puerto=Integer.parseInt(interfaz.getPuerto());
        try {
            ds=new DatagramSocket(puerto);
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(interfaz,"Error al abrir el puerto","Mi primer chat",JOptionPane.ERROR_MESSAGE);
        }
        while (activo)
        {
            mensaje=new byte[1024];
            dp=new DatagramPacket(mensaje,mensaje.length);
            synchronized (this)
            {
                try {
                    ds.receive(dp);
                } catch (IOException ex) {}
            }
           
            if (!activo)
                return;
            String cad;
            cad=new String(dp.getData());
            StringTokenizer st=new StringTokenizer(cad,"|");
            
           interfaz.setChat(st.nextToken()+": "+st.nextToken());
        }
            
        ds.close();
    }
    
}

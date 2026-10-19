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
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author roafi
 */
public class HiloCliente implements Runnable{

    private DatagramPacket dp;
    private DatagramSocket ds;
    private InetAddress ip;
    private int puerto;
    private Cliente interfaz;
    private boolean activo;
    private byte[] mensaje;
    private int tarea;

    public HiloCliente(Cliente interfaz) {
        this.interfaz = interfaz;
        activo=true;
        Thread hilo=new Thread(this);
        tarea=0;
        hilo.start();
    }

    public void setTarea(int tarea) {
        this.tarea = tarea;
    }
    
    
    @Override
    public void run() {
        puerto=Integer.parseInt(interfaz.getPuerto());
        while (activo)
        {
           synchronized(this)
           {
               try {
                   wait();
               } catch (InterruptedException ex) {}
           }
           if (!activo)
               return;
           switch (tarea)
           {
               case 1:{
                        mensaje=new byte[1024];
                        try {
                            ds=new DatagramSocket();
                        } catch (SocketException ex) {
                            JOptionPane.showMessageDialog(interfaz,"Error al abrir el socket!!","Chat UDP",JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                        try {
                            ip=InetAddress.getByName(interfaz.getIP());
                        } catch (UnknownHostException ex) {
                            JOptionPane.showMessageDialog(interfaz,"Error al leer la IP!!","Chat UDP",JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                        mensaje=(interfaz.getNick()+"|"+interfaz.getMensaje()).getBytes();
                        dp=new DatagramPacket(mensaje,mensaje.length,ip,puerto);
                        try {
                            ds.send(dp);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(interfaz,"Error al enviar el mensaje!!","Chat UDP",JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                        interfaz.setMensaje("");
                        break;
                      }
           }
        }
    }
    
    public synchronized void notifica()
    {
        notify();
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}

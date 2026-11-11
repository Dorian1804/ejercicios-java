/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_2;

/**
 *
 * @author roafi
 */
public class Clientes extends Personas {
    private static int contador=1;
    private int numCliente;
    private String rfc;
    private char tipo;
    private double salarioMensual;
    private String direccion;

    public Clientes() {
       super();
       numCliente=contador++;
       rfc="";
       tipo='N';
       salarioMensual=0;
       direccion="";
    }

    
    
    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        tipo=Character.toUpperCase(tipo);
        if (tipo=='V'||tipo=='N'||tipo=='P')
            this.tipo = tipo;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public boolean depositar (double cantidad)
    {
        return true;
    }
    
    public boolean retirar (double cantidad)
    {
        return true;
    }
}

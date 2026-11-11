/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_2;

/**
 *
 * @author roafi
 */
public class Cajeros extends Personas {
   private int numEmpleado;
   private double fondoInicial;
   private double fondoFinal;

    public Cajeros() {
        super ();
        numEmpleado=0;
        fondoInicial=1000;
        fondoFinal=1000;
    }

   
   
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public double getFondoInicial() {
        return fondoInicial;
    }

    public void setFondoInicial(double fondoInicial) {
        this.fondoInicial = fondoInicial;
    }

    public double getFondoFinal() {
        return fondoFinal;
    }

    public void setFondoFinal(double fondoFinal) {
        this.fondoFinal = fondoFinal;
    }
  
   
   
    
}

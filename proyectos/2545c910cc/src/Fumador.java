public class Fumador extends Thread {
    private Mesa mesa;
    private String nombre;
    private String ingredienteQueTiene;

    public Fumador(Mesa mesa, String nombre, String ingredienteQueTiene) {
        this.mesa = mesa;
        this.nombre = nombre;
        this.ingredienteQueTiene = ingredienteQueTiene;
    }

    @Override
    public void run() {
        while (true) {
            mesa.fumar(nombre, ingredienteQueTiene);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
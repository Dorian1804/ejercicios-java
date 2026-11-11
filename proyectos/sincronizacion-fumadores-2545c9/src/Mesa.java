import java.util.Random;

public class Mesa {
    private String ingrediente1 = null;
    private String ingrediente2 = null;

    public synchronized void ponerIngredientes(String dealer) {
        while (ingrediente1 != null || ingrediente2 != null) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        String[] ingredientes = {"tabaco", "papel", "cerillos"};
        Random r = new Random();
        int i1 = r.nextInt(3);
        int i2;
        do {
            i2 = r.nextInt(3);
        } while (i1 == i2);

        ingrediente1 = ingredientes[i1];
        ingrediente2 = ingredientes[i2];

        System.out.println(dealer + " puso: " + ingrediente1 + " y " + ingrediente2);
        notifyAll();
    }

    public synchronized void fumar(String fumador, String ingredienteQueTiene) {
        while (!puedeFumar(ingredienteQueTiene)) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        System.out.println(fumador + " tiene " + ingredienteQueTiene + " va a fumar ");
        ingrediente1 = null;
        ingrediente2 = null;
        notifyAll();
    }

    private boolean puedeFumar(String ingredienteDelFumador) {
        if (ingrediente1 == null || ingrediente2 == null) return false;
        return !ingrediente1.equals(ingredienteDelFumador) && !ingrediente2.equals(ingredienteDelFumador);
    }

    public static void main(String[] args) {
        Mesa mesa = new Mesa();

        Thread dealer = new Dealer(mesa);
        Thread f1 = new Fumador(mesa, "Fumador 1", "tabaco");
        Thread f2 = new Fumador(mesa, "Fumador 2", "papel");
        Thread f3 = new Fumador(mesa, "Fumador 3", "cerillos");

        dealer.start();
        f1.start();
        f2.start();
        f3.start();
    }

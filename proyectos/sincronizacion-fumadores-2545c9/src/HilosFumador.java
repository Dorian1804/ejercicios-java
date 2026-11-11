import java.util.Random;

public class HilosFumador {

    public static void main(String[] args) {
        Mesa mesa = new Mesa();

        Thread dealer = new Dealer(mesa);
        Thread fumador1 = new Fumador(mesa, "Fumador 1", "tabaco");
        Thread fumador2 = new Fumador(mesa, "Fumador 2", "papel");
        Thread fumador3 = new Fumador(mesa, "Fumador 3", "cerillos");

        dealer.start();
        fumador1.start();
        fumador2.start();
        fumador3.start();
    }
}


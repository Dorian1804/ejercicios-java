public class Dealer extends Thread {
    private Mesa mesa;

    public Dealer(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while (true) {
            mesa.ponerIngredientes("Dealer");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
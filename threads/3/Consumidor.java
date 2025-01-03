
public class Consumidor extends Thread {
    private final Fila fila;

    public Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = fila.retirar();
                Thread.sleep(500); // Simula o tempo de processamento do item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
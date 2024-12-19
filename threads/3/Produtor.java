import java.util.Random;

public class Produtor extends Thread {
    private final Fila fila;
    private final Random random = new Random();

    public Produtor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = random.nextInt(100) + 1; // Gerar número aleatório entre 1 e 100
                fila.adicionar(item);
                Thread.sleep(1000); // Espera 1 segundo para gerar o próximo item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
import java.util.LinkedList;
import java.util.Random;

public class Fila {
    private final LinkedList<Integer> fila = new LinkedList<>();
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
    }

    // Método para adicionar um item na fila
    public synchronized void adicionar(int item) throws InterruptedException {
        while (fila.size() == capacidade) {
            wait(); // Se a fila estiver cheia, espera até que haja espaço
        }
        fila.add(item);
        System.out.println("Produto adicionado: " + item);
        notifyAll(); // Notifica os consumidores de que há um item na fila
    }

    // Método para retirar um item da fila
    public synchronized int retirar() throws InterruptedException {
        while (fila.isEmpty()) {
            wait(); // Se a fila estiver vazia, espera até que haja um item
        }
        int item = fila.remove();
        System.out.println("Produto consumido: " + item);
        notifyAll(); // Notifica os produtores de que há espaço na fila
        return item;
    }
}







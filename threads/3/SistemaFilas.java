
public class SistemaFilas {
    public static void main(String[] args) throws InterruptedException {
        Fila fila = new Fila(10); // Fila com capacidade para 10 itens

        // Criando produtores e consumidores
        Thread produtor1 = new Produtor(fila);
        Thread produtor2 = new Produtor(fila);
        Thread consumidor1 = new Consumidor(fila);
        Thread consumidor2 = new Consumidor(fila);

        // Iniciando as threads
        produtor1.start();
        produtor2.start();
        consumidor1.start();
        consumidor2.start();

        // Aguardar o término das threads (para fins de demonstração, você pode ajustar o tempo de execução)
        Thread.sleep(20000); // O sistema vai rodar por 20 segundos, você pode aumentar ou diminuir
        System.exit(0); // Finaliza a execução após 20 segundos
    }
}


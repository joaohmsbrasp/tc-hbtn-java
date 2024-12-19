public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        // Criando duas threads para incrementar o contador
        ThreadContador t1 = new ThreadContador(contador);
        ThreadContador t2 = new ThreadContador(contador);

        // Iniciando as threads
        t1.start();
        t2.start();

        // Esperando as threads terminarem
        t1.join();
        t2.join();

        // Exibindo o valor final do contador
        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}

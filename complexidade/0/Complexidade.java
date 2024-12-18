
public class Complexidade {

	public static void main(String[] args) {
        // Exemplo simples de uso da classe
        int[] numeros = {10, 20, 5, 15, 30};

        System.out.println("Soma dos elementos: " + AlgoritmoExemplo.calcularSoma(numeros));
        System.out.println("Maior elemento: " + encontrarMaior(numeros));
    }
	
	 public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
	
}

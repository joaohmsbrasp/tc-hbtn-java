import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        // Inicializa o BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Digite uma linha de texto (digite \"sair\" para finalizar):");

            while (true) {
                // Captura a linha do usuário
                String line = scanner.nextLine();

                // Verifica se é para sair
                if (line.equalsIgnoreCase("sair")) {
                    break;
                }

                // Escreve a linha no arquivo
                writer.write(line);
                writer.newLine(); // Adiciona uma nova linha no arquivo
            }

            System.out.println("Arquivo '" + fileName + "' criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar ou escrever no arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}

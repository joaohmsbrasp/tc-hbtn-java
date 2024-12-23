import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura

        // Inicializa o BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Conteúdo do arquivo '" + fileName + "':\n");

            String line;
            while ((line = reader.readLine()) != null) {
                // Exibe cada linha do arquivo
                System.out.println(line);
            }

            System.out.println("\nLeitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

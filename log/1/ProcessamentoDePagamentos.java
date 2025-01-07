import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ProcessamentoDePagamentos {

    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

    public static void main(String[] args) {

        // Simula 5 pagamentos
        for (int i = 1; i <= 5; i++) {
            logger.info("Iniciando o processamento do pagamento {}", i);

            // Simulação de pagamento (sucesso, falha, pendente)
            Random random = new Random();
            int status = random.nextInt(3); // 0 = sucesso, 1 = falha, 2 = pendente

            switch (status) {
                case 0:
                    logger.info("Pagamento {} processado com sucesso.", i);
                    break;
                case 1:
                    logger.error("Erro ao processar o pagamento {}: Falha na transação.", i);
                    break;
                case 2:
                    logger.warn("Pagamento {} está pendente. Aguardando confirmação.", i);
                    break;
                default:
                    logger.error("Erro inesperado ao processar o pagamento {}", i);
            }

            // Simula o tempo de processamento de cada pagamento
            try {
                Thread.sleep(1000); // Simula 1 segundo de processamento
            } catch (InterruptedException e) {
                logger.error("Erro no processamento do pagamento {}: {}", i, e.getMessage());
            }
        }

        logger.info("Processamento de pagamentos concluído.");
    }
}

package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopiandoArquivosDiretorios {

    public static void main(String[] args) throws IOException {

        Path pastaContratos = Path.of("docs\\fornecedores\\contratos");
        Path arquivoContrato = Path.of("contrato-aluguel.txt");
        Path arquivoOrigem = pastaContratos.resolve(arquivoContrato);

        Path pastaFornecedores = Path.of("docs\\fornecedores\\contrato-aluguel.txt");
        Path pastaParceiros = Path.of("docs\\parceiros");

        //copia um arquivo de um Path para outro e substitui, caso ja exista
        Files.copy(arquivoOrigem, pastaFornecedores, StandardCopyOption.REPLACE_EXISTING);
    }
}

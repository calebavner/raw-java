package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MovendoArquivosDiretorios {

    public static void main(String[] args) throws IOException {

        Path origem = Path.of("docs\\fornecedores\\contrato.txt");
        Path destino = Path.of("docs\\parceiros\\contrato.txt");
        Path novaPasta = Path.of("docs\\nova-pasta");
        Path pastaFornecedores = Path.of("docs\\fornecedores");

        //move um arquivo de um diretorio a outro
        //Files.move(destino, origem);

        //move o conteudo de um diretorio a outro
        //a pasta movida deixa de existir
        //pode ser usado para renomear diretorios
        Files.move(pastaFornecedores, novaPasta);
    }
}

package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ExcluindoArquivosDiretorios {

    public static void main(String[] args) throws IOException {

        Path origemArquivo = Path.of("docs\\nova-pasta\\contrato.txt");
        Path destinoArquivo = Path.of("docs\\parceiros\\contrato.txt");
        Path pastaParceiros = Path.of("docs\\parceiros");
        Path pastaNova = Path.of("docs\\nova-pasta");

        //deleta um arquivo (caso ele exista) em um diretorio
        //se o arquivo não existir, lança exceção
        //Files.delete(destinoArquivo);

        //deleta um arquivo (caso ele exista) em um diretorio
        //se o arquivo não existir, não lança exceção
        Files.deleteIfExists(destinoArquivo);

        //deleta um diretorio desde que ele esteja vazio
        Files.move(pastaNova, pastaParceiros);
    }
}

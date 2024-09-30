package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ObterInfoDeArquivosDiretorios {

    public static void main(String[] args) throws IOException {

        Path pasta = Path.of("docs");
        Path arquivo = pasta.resolve(Path.of("contrato.txt"));

        //Obtendo tamanho do arquivo
        System.out.println("tamanho do arquivo: " + Files.size(arquivo));

        //Saber se o path e arquivo ou diretorio
        System.out.println("E arquivo: " + Files.isRegularFile(arquivo));
        System.out.println("E diretorio: " + Files.isDirectory(pasta));

        //Saber a data de modificação do arquivo
        System.out.println(Files.getLastModifiedTime(arquivo));

        //Saber quem criou o arquivo
        System.out.println(Files.getOwner(arquivo));
    }
}

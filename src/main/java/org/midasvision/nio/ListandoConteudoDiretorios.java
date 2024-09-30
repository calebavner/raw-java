package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListandoConteudoDiretorios {
    public static void main(String[] args) throws IOException {

        Path docs = Path.of("docs");

        //Files.list(docs).forEach(System.out::println);

        //Listando arquivos pelo nome
        /*try(var stream = Files.list(docs)) {
            stream
                    .map(Path::getFileName)
                    .forEach(System.out::println);
        }*/

        //Buscando um arquivo especifico
        /*try(var stream = Files.list(docs)) {
            stream
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(x -> x.equals("varios.txt"))
                    .forEach(System.out::println);
        }*/

        //Filtrando apenas uma extensão de arquivo
        try(var stream = Files.list(docs)) {
            stream
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(nome -> nome.matches(".*\\.txt"))
                    .forEach(System.out::println);
        }
    }
}

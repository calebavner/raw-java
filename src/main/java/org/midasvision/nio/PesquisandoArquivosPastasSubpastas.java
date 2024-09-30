package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PesquisandoArquivosPastasSubpastas {
    public static void main(String[] args) throws IOException {

        Path docs = Path.of("docs");

        //Buscando arquivo em subpastas
        try(var stream = Files.find(docs, Integer.MAX_VALUE,
                (path, attrs) -> path.getFileName()
                        .toString()
                        .matches(".*\\.txt"))) {

            stream.forEach(System.out::println);
        }
    }
}

package org.midasvision.nio;

import java.nio.file.Path;

public class CaminhosAbsolutosERelativos {

    public static final String CAMINHO_ABSOLUTO = "C:\\Users\\avner\\IdeaProjects\\raw-java\\docs\\contrato.txt";
    public static final String CAMINHO_RELATIVO = "contrato.txt";

    public static void main(String[] args) {

        Path arquivo = Path.of(CAMINHO_RELATIVO);
        Path pasta = Path.of("docs");

        //retorna o caminho absoluto de um arquivo
        System.out.println(arquivo.toAbsolutePath());

        //resolve o caminho de 2 arquivos
        System.out.println(pasta.resolve(arquivo));

        //normaliza um caminho relativo
        System.out.println(arquivo.normalize());
    }
}

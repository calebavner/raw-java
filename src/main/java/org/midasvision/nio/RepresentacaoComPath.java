package org.midasvision.nio;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class RepresentacaoComPath {
    public static void main(String[] args) {

        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs);

        //Primeira forma de obter um Path
        Path path = fs.getPath("C:\\Users\\avner\\IdeaProjects\\raw-java\\docs\\contrato.txt");

        //Segunda forma de obter um Path
        Path arquivo = Path.of("C:\\Users\\avner\\IdeaProjects\\raw-java\\docs\\contrato.txt");

        var fileName = arquivo.getFileName();
        var parent = arquivo.getParent();

        System.out.println(fileName);
        System.out.println(parent);
    }
}

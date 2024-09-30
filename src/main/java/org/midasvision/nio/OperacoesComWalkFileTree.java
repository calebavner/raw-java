package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class OperacoesComWalkFileTree {

    public static void main(String[] args) throws IOException {

        Path pastaDocs = Path.of("docs");

        //executar operações em todos os arquivos e subdiretorios
        Files.walkFileTree(pastaDocs, new SimpleFileVisitor<>(){

            //deletando os arquivos de diretorios
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.printf("Excluindo arquivo %s%n", file);
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            //deletando os diretorios
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.printf("Arquivo deletado: %s%n", dir);
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}

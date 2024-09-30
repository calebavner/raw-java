package org.midasvision.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OperacoesBasicasClasseFiles {

    public static void main(String[] args) throws IOException{

        Path workDir = Path.of("docs");
        Path pastaComHierarquia = Path.of("docs\\fornecedores\\contratos");
        Path arquivoContrato = pastaComHierarquia.resolve(Path.of("contratos.csv"));

        //cria um diretorio (não cria hierarquia de pastas)
        //Files.createDirectory(workDir);

        //cria um diretorio com hierarquia
        //Files.createDirectories(pastaComHierarquia);

        //deleta um diretorio
        //Files.delete(workDir);

        //verifica se um arquivo existe dentro de um Path
        System.out.println(Files.exists(arquivoContrato));

        //cria um arquivo dentro de um Path
        Files.createFile(arquivoContrato);
        System.out.println(Files.exists(arquivoContrato));
    }
}

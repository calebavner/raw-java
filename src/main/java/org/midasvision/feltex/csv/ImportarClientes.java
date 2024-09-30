package org.midasvision.feltex.csv;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportarClientes {

    private static final String CABECALHO = "nome;email;telefone";

    public static List<Cliente> lerArquivo(InputStream arquivo) throws Exception {

        List<Cliente> clientes = new ArrayList<>();

        try(var scanner = new Scanner(arquivo)) {
            scanner.useDelimiter("\n");
            var cabecalho = scanner.next();
            validarCabecalho(cabecalho);

            while(scanner.hasNext()){
                adicionarCliente(scanner.next(), clientes);
            }
        }

        return clientes;
    }

    private static void validarCabecalho(String cabecalho) throws Exception {
        if(!CABECALHO.equalsIgnoreCase(cabecalho))
            throw new Exception("Teste");
    }

    private static void adicionarCliente(String linha, List<Cliente> clientes) {
        var campos = linha.split(";");

        if(campos == null || campos.length < 2) {
            System.out.println("Erro");
        } else {
            clientes.add(new Cliente(campos[0], campos[1], campos[2]));
        }
    }
}

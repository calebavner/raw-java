package org.midasvision.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LendoArquivosComByteChannel {

    public static void main(String[] args) throws IOException {

        Path arquivo = Path.of("docs\\varios.txt");
        ByteBuffer buff = ByteBuffer.allocate(1024);

        try(var channel = Files.newByteChannel(arquivo, StandardOpenOption.READ)) {
            channel.read(buff);
            buff.flip();
            CharBuffer cb = StandardCharsets.UTF_8.decode(buff);
            System.out.println(cb);
        }
    }
}

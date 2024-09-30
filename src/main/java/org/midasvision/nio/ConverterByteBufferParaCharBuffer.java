package org.midasvision.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ConverterByteBufferParaCharBuffer {

    public static void main(String[] args) {

        ByteBuffer buff = ByteBuffer.allocate(1024);

        buff.put((byte) 79);
        buff.put((byte) 108);
        buff.put((byte) -61);
        buff.put((byte) -95);

        buff.flip();

        //CharBuffer cb = buff.asCharBuffer();

        //Decodifica um ByteBuffer para um CharBuffer, ja com o charset desejado
        CharBuffer cb = StandardCharsets.UTF_8.decode(buff);

        System.out.println(cb);

        //System.out.println(Arrays.toString("Olá".getBytes(StandardCharsets.UTF_8)));
    }
}

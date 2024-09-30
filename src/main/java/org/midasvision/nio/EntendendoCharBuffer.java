package org.midasvision.nio;

import java.nio.CharBuffer;

public class EntendendoCharBuffer {

    public static void main(String[] args) {

        //o allocate do CharBuffer, e feito em quantidade de caracteres
        CharBuffer buff = CharBuffer.allocate(1024);

        //adicionar chars no buffer
        buff.put('O');
        buff.put('L');
        buff.put('A');

        //Imprimindo um CharBuffer
        //System.out.println(Arrays.toString(buff.array()));

        //Pegando a posição exata de um buffer
        buff.flip();
        System.out.println(buff.charAt(0));
    }
}

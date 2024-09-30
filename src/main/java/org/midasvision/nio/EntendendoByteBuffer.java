package org.midasvision.nio;

import java.nio.ByteBuffer;

public class EntendendoByteBuffer {
    public static void main(String[] args) {

        ByteBuffer buff = ByteBuffer.allocate(1024);

        //indicar a posição atual do buffer
        System.out.println(buff.position());

        //retornar o ponteiro pora posição 0, altera o limit()
        buff.flip();

        //aponta a posição final do ponteiro
        //apos o uso do metodo flip(), aponta para ultima posição com elementos
        buff.limit();

        //limpa totalmente o buffer
        //limit() volta a ter a capacidade total do buffer
        buff.clear();

        //Adicionar valores a buffer
        buff.put((byte) 20);
    }
}

package br.com.software.adapter.exemplo02.adapters;

import br.com.software.adapter.exemplo02.Message;
import br.com.software.adapter.exemplo02.Sender;

public class EmailSenderAdapter implements Sender {

    @Override
    public void send(Message message) {
        System.out.println("Enviando mensagem por email!");
    }
}
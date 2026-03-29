package br.com.software.adapter.exemplo02.adapters;

import br.com.software.adapter.exemplo02.message.Message;
import br.com.software.adapter.exemplo02.Sender;

public class WhatsAppSenderAdapter implements Sender {

    @Override
    public void send(Message message) {
        System.out.println("Enviando mensagem via WhatsApp!");
    }
}
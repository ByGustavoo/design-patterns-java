package br.com.software.adapter.exemplo02.main;

import br.com.software.adapter.exemplo02.message.Message;
import br.com.software.adapter.exemplo02.message.SendMessageUseCase;
import br.com.software.adapter.exemplo02.Sender;
import br.com.software.adapter.exemplo02.adapters.EmailSenderAdapter;
import br.com.software.adapter.exemplo02.adapters.WhatsAppSenderAdapter;

public class AdapterMain {
    static void main() {
        Sender emailSenderAdapter = new EmailSenderAdapter();
        Sender whatsAppSenderAdapter = new WhatsAppSenderAdapter();

        boolean condicao = obterCondicao();
        SendMessageUseCase sendMessageUseCase;

        if (condicao) {
            sendMessageUseCase = new SendMessageUseCase(emailSenderAdapter);
        } else {
            sendMessageUseCase = new SendMessageUseCase(whatsAppSenderAdapter);
        }

        Message message = obterMessage();
        sendMessageUseCase.send(message);
    }

    private static boolean obterCondicao() {
        return true;
    }

    private static Message obterMessage() {
        return new Message();
    }
}
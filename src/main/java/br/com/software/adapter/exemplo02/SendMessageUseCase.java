package br.com.software.adapter.exemplo02;

public class SendMessageUseCase {

    private Sender sender;

    public SendMessageUseCase(Sender sender) {
        this.sender = sender;
    }

    public void send(Message message) {
        sender.send(message);
    }
}
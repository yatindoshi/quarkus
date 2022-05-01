package service;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import model.Message;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class MessageService {

    public Uni<Void> saveMessage(String msg) {
        var message = new Message(UUID.randomUUID().toString(), msg);
        return Message.persist(message);
    }

    @Blocking
    public Multi<Message> getMessages() {
        return Message.streamAll();
    }
}

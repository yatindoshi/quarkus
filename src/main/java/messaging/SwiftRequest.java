package messaging;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import service.MessageService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@Slf4j
public class SwiftRequest {

    @Inject
    MessageService messageService;

    @Incoming("requests")
    public Uni<Void> process(String msg) {
        return Panache.withTransaction(() -> messageService.saveMessage(msg).replaceWithVoid());

    }
}

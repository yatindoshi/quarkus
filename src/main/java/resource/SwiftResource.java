package resource;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import model.Message;
import service.MessageService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("swift")
@ApplicationScoped
public class SwiftResource {

    @Inject
    MessageService messageService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Uni<Response> generateSwift(String message) {
        return Panache
                .withTransaction(() -> messageService.saveMessage(message))
                .replaceWith(Response.accepted().build());
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Multi<Message> getSwiftMessages() {
        return messageService.getMessages();
    }
}

package resource;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("swift")
@ApplicationScoped
public class SwiftResource {

    @GET
    public Uni<String> generateSwift() {
        return Uni.createFrom().item("test");
    }
}

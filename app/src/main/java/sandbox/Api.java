package sandbox;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import greeting.Greeting;

@Path("/")
public class Api {

    @Inject
    public Greeting greeting;

    @GET
    public String index() {
        return greeting.getGreeting();
    }
}

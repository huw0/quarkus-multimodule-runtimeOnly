package sandbox;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Api {

    @GET
    public String index() {
        return "test";
    }
}

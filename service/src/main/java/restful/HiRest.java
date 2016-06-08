package restful;

import ejb.ConvertBean;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Created by jeremy on 2016/5/31.
 */

@Path("/users")
public class HiRest {

    @GET
    @Path("/showall")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHtml()
    {
        return "Hello World!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String noneRes()
    {
        return "Oops, there is no content here!";
    }

    @GET
    @Path("/ejbtest")
    @Produces(MediaType.TEXT_PLAIN)
    public String hi() {
        try
        {
            Context ctx = (Context) new InitialContext();

        }
        catch (NamingException e)
        {
            e.printStackTrace();
        }
        return "Hello";
    }
}

package restful;


import ejb.beans.NoInfBeanBean;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jeremy on 2016/5/31.
 */

@Path("hi")
public class HiRest
{

    @EJB(lookup = "java:global/redtree/core/NoInfBeanEJB")
    NoInfBeanBean nf;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String noneRes()
    {
        return "Oops, there is no content here!";
    }

    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String hi()
    {
        return nf.test();
    }


}

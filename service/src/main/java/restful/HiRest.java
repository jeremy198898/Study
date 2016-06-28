package restful;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jeremy on 2016/5/31.
 */

@Path("users")
public class HiRest {

    //@EJB
    //private HiBean hiBean;

    @GET
    @Path("showall")
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

//    @GET
//    @Path("ejb")
//    @Produces (MediaType.APPLICATION_JSON)
//    public String ejb()
//    {
//        return hiBean.sayHello();
//    }

}

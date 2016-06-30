package apis;

import beans.inf.UserInf;
import entity.User;
import restful.JsonHeader;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jeremy on 2016/6/30.
 */
@Path("user")
public class EntityTest
{
    //@EJB(lookup = "java:global/redtree/core/UserEJB!beans.inf.UserInf")
    //UserInf userInf;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String error()
    {
        return "Oops, there is nothing here!";
    }

//    @GET
//    @Path("showall")
//    @Produces(JsonHeader.JSON_HEADER)
//    public String showall()
//    {
//        List<User> users = userInf.getList();
//        String s = "";
//        for (User user:users)
//        {
//            s +=user.getUsername()+" ";
//        }
//        return s;
//    }

}

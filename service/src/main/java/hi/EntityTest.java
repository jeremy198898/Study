package hi;

import application.JsonHeader;
import beans.inf.UserInf;
import entity.User;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by jeremy on 2016/7/1.
 */
@Path("user")
@ManagedBean
public class EntityTest
{
    @EJB
    UserInf userInf;

    @GET
    @Produces(JsonHeader.JSON_HEADER)
    public String error()
    {
        return "There is nothing here you are looking for!";
    }

    @GET
    @Path("showall")
    @Produces(JsonHeader.JSON_HEADER)
    public String getAllUsers()
    {
        List<User> users = userInf.getList();
        String s = "";
        for (User user:users)
        {
            s +=user.getUsername()+" ";
        }
        return s;
    }

}

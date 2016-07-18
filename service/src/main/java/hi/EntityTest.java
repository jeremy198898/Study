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
@Produces(JsonHeader.JSON_HEADER)
//@Consumes
public class EntityTest
{
    @EJB
    UserInf userInf;

    @GET
    public String error()
    {
        return "There is nothing here you are looking for!";
    }

    @GET
    @Path("showall")
    public String getAllUsers()
    {
        List<User> users = userInf.getAllUsers();
        String s = "";
        for (User user:users)
        {
            s +=user.getUsername()+" ";
        }
        return s;
    }

    @GET
    @Path("userjson")
    public List<User> allUser()
    {
        List<User> users = userInf.getAllUsers();
        return users;
    }

    @GET
    @Path("userinfo")
    public User getUserById()
    {
        int id = 340;
        return userInf.findUserById(id);
    }

    @GET
    @Path("username")
    public List<User> getUserByName()
    {
        String name = "张志德";
        List<User> users = userInf.findUserByName("999999999");
        return users;
    }


}

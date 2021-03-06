package hi;

import application.JsonHeader;
import test.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jeremy on 2016/7/6.
 * This demo is for formatting data of API.
 */
@Path("hi")
@Produces(JsonHeader.JSON_HEADER)
public class HiJson
{
    @GET
    public String hi()
    {
        return "Hello, Restful!";
    }

    @GET
    @Path("jsontest")
    public Test testJson()
    {
        Test test = new Test();
        test.setUsername("Jeremy");
        test.setId(999);
        return test;
    }

    @GET
    @Path("buildfactory")
    public String buildFactory()
    {
        return "buildfactory";
    }

}

package hi;

import application.JsonHeader;
import test.Test;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jeremy on 2016/7/6.
 * This demo is for formatting data of API.
 */
@Path("hi")
public class HiJson
{
    @GET
    @Produces(JsonHeader.JSON_HEADER)
    public String hi()
    {
        return "Hello, Restful!";
    }

    @GET
    @Path("jsontest")
    @Produces(JsonHeader.JSON_HEADER)
    public Test testJson()
    {
        Test test = new Test();
        test.setUsername("Jeremy");
        test.setId(999);
        return test;
    }

    @GET
    @Path("buildfactory")
    @Produces(JsonHeader.JSON_HEADER)
    public String buildFactory()
    {
        return "buildfactory";
    }
}

package ejb.beans;

import javax.ejb.Stateless;

/**
 * Created by jeremy on 2016/6/17.
 */
@Stateless(name = "HiEJB")
public class HiBean
{
    public HiBean()
    {
    }

    public String sayHello()
    {
        return "Welcome to my EJB world!";
    }
}

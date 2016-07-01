package ejb.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Created by jeremy on 2016/6/29.
 */
@Stateless(name = "NoInfBeanEJB")
@LocalBean
public class NoInfBeanBean
{
    public String test()
    {
        return "This bean is just a test with no interface.";
    }
}

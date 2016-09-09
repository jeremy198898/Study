package ejb.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Cacheable;

/**
 * Created by jeremy on 2016/6/29.
 */
@Stateless(name = "NoInfBeanEJB")
@LocalBean
@Cacheable
public class NoInfBeanBean
{
    public String test()
    {
        return "This bean is just a test with no interface.";
    }
}

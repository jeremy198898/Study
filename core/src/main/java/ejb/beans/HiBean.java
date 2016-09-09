package ejb.beans;

import beans.inf.HiInf;

import javax.ejb.Stateless;
import javax.persistence.Cacheable;

/**
 * Created by jeremy on 2016/6/17.
 */
@Stateless(name = "HiEJB")
@Cacheable
public class HiBean implements HiInf
{
    public HiBean()
    {
    }

    @Override
    public String sayHello()
    {
        return "Welcome to my EJB world!";
    }
}

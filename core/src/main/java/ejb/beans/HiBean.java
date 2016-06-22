package ejb.beans;

import beans.inf.HiInf;

import javax.ejb.Stateless;

/**
 * Created by jeremy on 2016/6/17.
 */
@Stateless(name = "HiEJB")
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

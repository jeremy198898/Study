package ejb.beans;

import beans.inf.UserInf;
import entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jeremy on 2016/6/22.
 */
@Stateless(name = "UserEJB")
public class UserBean implements UserInf
{
    @PersistenceContext(unitName = "pgsql")
    private EntityManager em;

    public UserBean()
    {
    }

    @Override
    public void create(User user)
    {
        em.persist(user);
    }

    @Override
    public String sayHello()
    {
        return "Fuck";
    }
}
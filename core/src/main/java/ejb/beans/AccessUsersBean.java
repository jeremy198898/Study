package ejb.beans;

import entity.AccessUsers;
import entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jeremy on 2016/9/14.
 */
@Stateless(name = "AccessUsersEJB")
public class AccessUsersBean
{
    @PersistenceContext (unitName = "mysql")
    private EntityManager em;

    public AccessUsersBean()
    {
    }

    public String sayHi(){
        return "张志德";
    }

    //新增用户
    public void add(String username, String name, int sex, int department, int position)
    {
        AccessUsers user = new AccessUsers();
        user.setUsername(username);
        user.setName(name);
        user.setSex(sex);
        user.setPosition(position);
        //user.setEmail(email);
        //user.setMobile(mobile);
        //user.setPhone(phone);
        em.persist(user);
    }
}

package ejb.beans;

import beans.inf.UserInf;
import entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

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
        return "Test for EJB bean with interface.";
    }

    @Override
    public void add(int orgid, String username, String password, String nickname)
    {
        User user = new User();
        user.setOrgid(orgid);
        user.setUsername(username);
        user.setPassword(password);
        user.setNickname(nickname);
        em.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        Query rs = em.createQuery("select u from User u");
        List<User> users = rs.getResultList();
        return users;
    }

    @Override
    public User findUserById(int id)
    {
        User user = new User();
        user = em.find(User.class, id);
        return user;
    }

    @Override
    public List<User> findUserByName(String name) {
        Query rs = em.createQuery("SELECT u FROM User u WHERE u.username=?1");
        List<User> users = rs.setParameter(1, name).getResultList();
        return users;
    }

}

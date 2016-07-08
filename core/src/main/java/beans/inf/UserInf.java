package beans.inf;

import entity.User;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by jeremy on 2016/6/20.
 */
@Local
public interface UserInf
{
    void create(User user);

    String sayHello();

    void add(int orgid, String username, String password, String nickname);

    List<User> getAllUsers();

    User findUserById(int id);

    List<User> findUserByName(String name);
}

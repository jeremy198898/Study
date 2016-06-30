package mvc;

/**
 * Created by jeremy on 2016/6/30.
 */
public class LoginService
{
    public boolean AuthUser(String username, String password)
    {
        if ((username != null && password !=null) || (!username.isEmpty() && !password.isEmpty()))
        {
            return true;
        }
        return false;
    }

}

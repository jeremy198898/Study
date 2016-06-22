package pojo;

/**
 * Created by jeremy on 2016/6/22.
 */
public class UserVo
{
    private int id;
    private int orgid;
    private String username;
    private String password;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getOrgid()
    {
        return orgid;
    }

    public void setOrgid(int orgid)
    {
        this.orgid = orgid;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}

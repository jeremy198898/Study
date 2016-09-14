package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jeremy on 2016/6/20.
 * From Postgresql , this is just test.
 */
@Entity
@Table(name = "t_access_user")
public class AccessUsers implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", nullable = false)
    private String username;

    private String name;

    @Column(name = "sex", nullable = false)
    private int sex;

    private String birthday;

    @Column(name = "department", nullable = false)
    private int department;

    @Column(name = "position", nullable = false)
    private int position;

    private String email;

    private String mobile;

    private String phone;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public int getDepartment()
    {
        return department;
    }

    public void setDepartment(int department)
    {
        this.department = department;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}

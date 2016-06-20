package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jeremy on 2016/6/18.
 */
@Entity
@Table(name = "t_users")
public class Users implements Serializable {

    public Users(){}

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column (name = "password", nullable = false)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

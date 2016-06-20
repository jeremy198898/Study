package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jeremy on 2016/6/20.
 */
@Entity
@Table(name = "t_ec_org")
public class Org implements Serializable {

    @Id
    @Column(name = "kid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int kid;

    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

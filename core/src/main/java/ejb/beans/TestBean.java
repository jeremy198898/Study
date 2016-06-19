package ejb.beans;

import beans.inf.TestInf;
import entity.Test;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jeremy on 2016/6/18.
 */
@Stateless(name = "TestEJB")
public class TestBean{
    public TestBean() {
    }

    //@PersistenceContext(unitName = "mysql")
    //private EntityManager em;

//    @Override
//    public boolean add(Test test) {
//        em.persist(test);
//        return false;
//    }

    public String sayHi()
    {
        return "fuck";
    }
}

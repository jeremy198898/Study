package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jeremy on 2016/6/19.
 */
@WebServlet("/test")
public class EJBTest extends HttpServlet {

    /*
    * Three ways to cll EJB*/
    //1.portable way to call since EJB 3.1
    //@EJB(lookup = "java:global/redtree/core/NoInfBeanEJB")
    //NoInfBeanBean noInfBeanBean;

    //2.you can compile EJB module which included in war as jar
    //HiInf hi;

    //3.you can use JNDI lookup to call EJB
//    @Override
//    public void init() throws ServletException
//    {
//        LookupBeans lb = new LookupBeans();
//        try
//        {
//            Object object = lb.lookupBean("UserEJB");
//            UserInf user = (UserInf)object;
//            System.out.println(user.sayHello());
//        }
//        catch (NamingException e)
//        {
//            e.printStackTrace();
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //User userVo = new User();
        //userVo.setOrgid(8888);
        //userVo.setUsername("张志德");
        //userVo.setPassword("987625214");
        //userVo.setNickname("zzd");
        //user.create(userVo);
        //out.println(hi.sayHello()+"<br/>"+user.sayHello());

        //out.println(user.sayHello());
        //out.println("testaa");

        //test with no interface EJB bean
        //out.println(noInfBeanBean.test());
    }
}

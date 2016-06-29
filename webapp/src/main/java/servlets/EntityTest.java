package servlets;

import beans.inf.UserInf;
import entity.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jeremy on 2016/6/29.
 */
@WebServlet("entity")
public class EntityTest extends HttpServlet
{
    @EJB(lookup = "java:global/redtree/core/UserEJB!beans.inf.UserInf")
    UserInf userInf;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("Entity Test");

        //User user = new User();
        //user.setOrgid(235689);
        //user.setUsername("zhangzhide");
        //user.setPassword("987test123");
        //user.setNickname("Jeremy");

        //userInf.create(user);

        userInf.add(998856, "张志德", "123456", "zzd");

        out.println("<script>alert('Successfully added!')</script>");
    }
}

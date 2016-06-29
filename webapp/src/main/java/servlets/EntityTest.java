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
import java.util.List;

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

        //Directly use entity
        //User user = new User();
        //user.setOrgid(235689);
        //user.setUsername("zhangzhide");
        //user.setPassword("987test123");
        //user.setNickname("Jeremy");

        //userInf.create(user);

        //second way is to use
        //userInf.add(998856, "张志德", "123456", "zzd");
        out.println("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>EntityTest</title></head><body>");
        out.println("<div><div><form name=\"adduser\" action=\"/webapp/entity\" method=\"get\"><input type=\"text\" name=\"username\"/><input type=\"submit\" name=\"Create User\"></form></div><table>");

        List<User> users = userInf.getList();
        for(User user : users){
            out.println("用户组织编码:"+user.getOrgid()+" Username:"+user.getUsername()+"Password:"+user.getPassword()+"<br/>");
        }
        //out.println("<script>alert('Successfully added!')</script>");

        out.println("</table></div></body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userInf.add(998856, "张志德zz", "123456", "zzder");
    }
}

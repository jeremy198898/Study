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
    @EJB
    UserInf userInf;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        //System.out.println(userInf);

        //Directly use entity
        //User user = new User();
        //user.setOrgid(235689);
        //user.setUsername("zhangzhide");
        //user.setPassword("987test123");
        //user.setNickname("Jeremy");

        //userInf.create(user);

        String username = req.getParameter("username");

        if (username == null)
        {
            out.print("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>EntityTest</title><style>.tb table{background:#0066cc}.tb td{background:#FFF}</style></head><body>");
            out.print("<div><div><form name=\"adduser\" action=\"/webapp/entity\" method=\"get\"><input type=\"text\" name=\"username\"/><input type=\"submit\" value=\"创建新用户\"></form></div><br /><div class=\"tb\"><table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">");
            out.print("<tr><th>ID</th><th>组织编码</th><th>用户名</th><th>密码</th><th>昵称</th></tr>");

            List<User> users = userInf.getList();
            for(User user : users){
                out.print("<tr><td>"+user.getId()+"</td><td>"+user.getOrgid()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td><td>"+user.getNickname()+"</td></tr>");
            }
            //out.println("<script>alert('Successfully added!')</script>");

            out.print("</table></div></div></body></html>");
        }
        else if (username.equals(""))
        {
            out.println("<script>alert(\"请输入用户名\")</script>");
        }
        else
        {
            userInf.add(998856, username, "123456", "zzd");
            out.print("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>EntityTest</title><style>.tb table{background:#0066cc}.tb td{background:#FFF}</style></head><body>");
            out.print("<div><div><form name=\"adduser\" action=\"/webapp/entity\" method=\"get\"><input type=\"text\" name=\"username\"/><input type=\"submit\" value=\"创建新用户\"></form></div><br /><div class=\"tb\"><table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">");
            out.print("<tr><th>ID</th><th>组织编码</th><th>用户名</th><th>密码</th><th>昵称</th></tr>");

            List<User> users = userInf.getList();
            for(User user : users){
                out.print("<tr><td>"+user.getId()+"</td><td>"+user.getOrgid()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td><td>"+user.getNickname()+"</td></tr>");
            }
            //out.println("<script>alert('Successfully added!')</script>");

            out.print("</table></div></div></body></html>");
        }
        System.out.println(username);
        //out.println("<script>alert(\"请输入用户名\")</script>");
        //second way is to use through EJB



    }

}

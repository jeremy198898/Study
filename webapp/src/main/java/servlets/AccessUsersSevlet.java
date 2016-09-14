package servlets;

import ejb.beans.AccessUsersBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jeremy on 2016/9/14.
 */
@WebServlet("/user")
public class AccessUsersSevlet extends HttpServlet
{
    @EJB
    private AccessUsersBean accessUsersBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //accessUsersBean.add("张志德", "jeremy", 1, 1001, 10,"jeremy@zhangzhide.com", "18321138970", "021-60796051");

        for (int i = 1; i<19999; i++){
            accessUsersBean.add("jeremy"+i, "jeremy", 1, 100, 34);
            System.out.println(i);
    }

        //accessUsersBean.add("zhangzhide", "jeremy", 1, 100, 34);

        //String user = accessUsersBean.sayHi();

        //PrintWriter out = resp.getWriter();

        //out.print(user);
    }
}

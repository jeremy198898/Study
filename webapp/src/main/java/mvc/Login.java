package mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jeremy on 2016/6/30.
 */
@WebServlet("login")
public class Login extends HttpServlet
{
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
//    {
//        resp.sendRedirect("mvc/login.jsp");
//    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);

        LoginService ls = new LoginService();
        boolean auth = ls.AuthUser(username, password);

//        if (auth)
//        {
//            //resp.sendRedirect("mvc/success.jsp");
//            //return;
//        }
//        else
//        {
//            //resp.sendRedirect("mvc/login.jsp");
//            //return;
//        }
    }
}

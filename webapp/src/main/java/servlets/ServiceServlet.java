package servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jeremy on 2016/6/29.
 * servlet中默认情况下，无论你是get还是post提交过来都会经过service（）方法来处理，然后转向到doGet或是doPost方法
 */
@WebServlet("servlet/service")
public class ServiceServlet extends HttpServlet
{
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
//    {
//        res.getOutputStream().println("Hi,I am servlet service!");
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.getOutputStream().println("I am get method");
    }
}

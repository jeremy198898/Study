package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jeremy on 2016/5/12.
 */
@WebServlet("/hello")
public class HiServlets extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //String c = req.getParameter("test");
        //String x = req.getParameter("number");
        String chtest = "这是个测试";
        //String hi = hiBean.sayHello();
        //String client = req.getHeader("User-Agent");
        //out.print("The parameter is "+c+" "+x);
        out.println(chtest);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        String para = req.getParameter("typein");
        String color = req.getParameter("color");

        //String client = req.getHeader("User-Agent");
        //String host = req.getRemoteHost();

        if (para.equals("wildfly") && color.equals("red"))
        {
            resp.sendRedirect("http://www.zhangzhide.com:9990");
        }

    }
}

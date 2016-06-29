package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jeremy on 2016/6/29.
 *
 * Servlet体系结构是建立在Java多线程机制之上的，它的生命周期是由Web容器负责的
 * 当客户端第一次请求某个Servlet时，Servlet 容器将会根据web.xml配置文件实例化这个Servlet类。当有新的客户端请求该Servlet时，一般不会再实例化该Servlet类，也就是有多个线程在使用这个实例
 *
 */
public class StudyServlet extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.service(req, resp);
    }
}

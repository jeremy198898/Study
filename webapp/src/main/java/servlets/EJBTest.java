package servlets;

import beans.inf.UserInf;
import ejb.beans.UserBean;
import pojo.UserVo;

import javax.ejb.EJB;
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

    @EJB
    private UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        UserVo userVo = new UserVo();
        userVo.setOrgid(8888);
        userVo.setUsername("张志德");
        userVo.setPassword("987625214");
        //userBean.create(userVo);
        out.println(userBean.sayHi());
    }
}

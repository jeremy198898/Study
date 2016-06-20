package servlets;

import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by jeremy on 2016/6/20.
 */
@WebServlet("user")
public class UserServlet extends HttpServlet {

    @PersistenceContext(unitName = "pgsql")
    private EntityManager pgsql;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("Hello,all users!");

        Query rs = pgsql.createQuery("select u from User u");
        List<User> users = rs.getResultList();
        for(User user : users){
            out.println(user.getOrgid()+" "+user.getUsername()+" "+user.getPassword());
        }
        pgsql.clear();
    }
}

package servlets;

import entity.Users;

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
@WebServlet("/entitytest")
public class EntityTest extends HttpServlet
{
    @PersistenceContext (name = "mysql")
    private EntityManager em;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Query q = em.createQuery("select u from Users u");
        List<Users> ulist = q.getResultList();
        for (Users users : ulist){
            out.println(users.getUsername());
        }

        out.println("Hello");
    }
}

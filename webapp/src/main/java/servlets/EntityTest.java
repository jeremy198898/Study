package servlets;

import entity.Org;

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
@WebServlet("entitytest")
public class EntityTest extends HttpServlet
{
    @PersistenceContext (unitName = "pgsql")
    private EntityManager em;

    //@PersistenceContext(unitName = "mysql")
    //private EntityManager mysql;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Query q = em.createQuery("select o from Org o");
        List<Org> orglist = q.getResultList();
        for (Org org : orglist){
            out.println(org.getId()+" "+org.getCode()+"<br />");
        }

        //Query users = mysql.createQuery("select u from Users  u");
        //List<Users> userlist = users.getResultList();
        //for (Users user : userlist){
        //   out.println(user.getId()+" "+user.getUsername()+" "+user.getPassword()+"<br />");
        //}

    }
}

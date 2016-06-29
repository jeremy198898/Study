package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by jeremy on 2016/5/30.
 *
 * A filter is an object that can transform the header and content (or both) of a request or response.
 *
 * a filter can add an attribute to the request or can insert data in the response.
 */
@WebFilter("/*")
public class HiFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        chain.doFilter(request, response);

        System.out.println("Filter Successfully.");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}

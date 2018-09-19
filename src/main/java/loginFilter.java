import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter("/*")
public class loginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }
    @Override

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
       //String loginURI = request.getContextPath() + "/login";

        boolean loggedIn = session != null && session.getAttribute("user") != null;
        boolean loginRequest = request.getRequestURI().equals("index.jsp");

        if (loggedIn || loginRequest) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}

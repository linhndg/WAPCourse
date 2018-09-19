import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String user = req.getParameter("name");
        String pass = req.getParameter("pass");
        String remember = req.getParameter("remember");


        List<User> users = new ArrayList<>();
        users.add(new User("linh", "123"));
        if (users.contains(new User(user, pass))){
            if (remember != null)
            {
                Cookie cookie = new Cookie("user", user);
                cookie.setMaxAge(30*24*60*60); //in seconds
                resp.addCookie(cookie);
            } else{
                Cookie cookie = new Cookie("user", user);
                cookie.setMaxAge(0); //in seconds
                resp.addCookie(cookie);
            }
            session.setAttribute("user", user);
            resp.sendRedirect("welcome.jsp");
        } else {
            resp.sendRedirect("index.jsp");
        }

    }
}

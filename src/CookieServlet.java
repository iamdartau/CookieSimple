import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class CookieServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Cookie cookie = new Cookie("hi", "my_name_is");
        Cookie cookie1 = new Cookie("second", "cookie");
        cookie1.setMaxAge(60*60*24);
        cookie.setMaxAge(5);
        response.addCookie(cookie1);
        response.addCookie(cookie);
        response.sendRedirect("/");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Cookie [] cookies = request.getCookies();
        request.setAttribute("cookies", cookies);

        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}

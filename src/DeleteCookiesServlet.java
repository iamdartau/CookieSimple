import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteCookiesServlet", value = "/delete")
public class DeleteCookiesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie [] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie cookie: cookies
                 ) {
                if(cookie.getName().equals("hi")){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }else if (cookie.getValue().equals("cookie")){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }response.sendRedirect("/");
    }
}

package spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BServlet extends AServlet {

    public void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        res.getWriter().write(" execute B servlet with HttpServletRequest method    ");
    }

}

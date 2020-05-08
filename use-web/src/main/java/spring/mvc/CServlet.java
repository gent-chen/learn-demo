package spring.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CServlet extends HttpServlet{

    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.getWriter().write("test hahahahah");
    }

}

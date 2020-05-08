package spring.mvc;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AServlet extends GenericServlet {


    public void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        res.getWriter().write(" execute A servlet with HttpServletRequest method    ");
    }


    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        res.getWriter().write(" execute A servlet with ServletRequest method    ");
        service((HttpServletRequest)req,(HttpServletResponse)res);
    }
}

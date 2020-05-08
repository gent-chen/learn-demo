package spring.tomcat;

import javax.servlet.*;
import java.io.IOException;

public class ServeltImpl implements Servlet {

    private ServletConfig config;

    public void init(){

    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("servlet init");
        this.config=config;
        this.init();
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("tell me why how to do it");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
    }
}

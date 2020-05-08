package springtest;

import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;
import spring.tomcat.ServeltImpl;

import javax.servlet.ServletException;
import java.io.IOException;

public class ClassTest {

    @Test
    public void testAdd() throws ServletException, IOException {
        System.out.println(WebApplicationContext.class.getName() + ".ROOT");
        ServeltImpl impl=new ServeltImpl();
        impl.service(null,null);
    }
}

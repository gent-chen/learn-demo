package springtest;

import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;
import spring.tomcat.ServeltImpl;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Iterator;
import java.util.ServiceLoader;

public class ClassTest {

    @Test
    public void testAdd() throws ServletException, IOException {
        System.out.println(WebApplicationContext.class.getName() + ".ROOT");
        ServeltImpl impl=new ServeltImpl();
        impl.service(null,null);
    }

    @Test
    public void hibernateTest(){
        ServiceLoader<AutoCloseable> serviceLoader = ServiceLoader.load( AutoCloseable.class );
        int count=0;
        Iterator<AutoCloseable> iterator=serviceLoader.iterator();
        while(iterator.hasNext()){
            count++;
            iterator.next();
        }

        System.out.println(count);
    }
}

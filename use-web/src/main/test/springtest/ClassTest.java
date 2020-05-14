package springtest;

import org.hibernate.dialect.Cache71Dialect;
import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;
import spring.tomcat.ServeltImpl;

import javax.servlet.ServletException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ServiceLoader;

public class ClassTest {

    @Test
    public void testAdd() throws ServletException, IOException {
        System.out.println(WebApplicationContext.class.getName() + ".ROOT");
        System.out.println(Cache71Dialect.class.getName());
//        ServeltImpl impl=new ServeltImpl();
//        impl.service(null,null);
    }

    @Test
    public void hibernateTest() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        ServiceLoader<CharSequence> serviceLoader = ServiceLoader.load( CharSequence.class );
        System.out.println(CharSequence.class.getName());
        int count=0;
        Iterator<CharSequence> iterator=serviceLoader.iterator();
        while(iterator.hasNext()){
            count++;
            System.out.println(iterator.next().getClass());
        }
        System.out.println(count);
    }
}

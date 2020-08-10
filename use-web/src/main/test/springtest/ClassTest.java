package springtest;

import org.hibernate.dialect.Cache71Dialect;
import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
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

    @Test
    public void testProperties() throws IOException, URISyntaxException {
        Properties properties=new Properties();
//        URI uri=new URI("");
        InputStream stream = null;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        stream=classLoader.getResourceAsStream("jdbc.properties");
        ClassLoader.getSystemResourceAsStream("");
        this.getClass().getClassLoader().getResourceAsStream("");

        ClassTest.class.getResourceAsStream("");

//        InputStream in=new URL("classpath*:jdbc.properties").openStream();
//        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("");
        properties.load(stream);
    }

}

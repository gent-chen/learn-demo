package spring.jdbc;

import org.hibernate.internal.util.ConfigHelper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestJdbcTemplate extends JdbcDaoSupport {

    public TestJdbcTemplate() throws IOException {
        Properties properties=new Properties();
        InputStream in=new URL("/jdbc.properties").openStream();
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("");
        properties.load(in);
    }

}

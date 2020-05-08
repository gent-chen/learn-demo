package hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class TestFactory {

    public static void main(String[] args){

        SessionFactory sessionFactory=getSessionFactory();
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from User");
        for(Object o:query.list()){
            System.out.println(o);
        }
    }

    private static SessionFactory getSessionFactory(){
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry;
        registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            return  new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }
}

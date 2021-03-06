package hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Query;
import org.hibernate.secure.spi.JaccIntegrator;

public class TestFactory {

    public static void main(String[] args){
        SessionFactory sessionFactory=null;
        Session session=null;
        try{
            sessionFactory=getSessionFactory();
            session=sessionFactory.openSession();
            Query query=session.createQuery("from MutiKeyEntity");
            for(Object o:query.list()){
                System.out.println(o);
            }
        }finally {
            sessionFactory.close();
            session.close();
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
            e.printStackTrace();
        }
        return null;
    }


    public static SessionFactory getMyFactory(){

//        BootstrapServiceRegistryBuilder
        BootstrapServiceRegistryBuilder bootstrapServiceRegistryBuilder=new BootstrapServiceRegistryBuilder();
        bootstrapServiceRegistryBuilder.applyClassLoader(ClassLoader.getSystemClassLoader());
        bootstrapServiceRegistryBuilder.applyIntegrator(new JaccIntegrator());
        bootstrapServiceRegistryBuilder.applyClassLoaderService(null);
        bootstrapServiceRegistryBuilder.applyStrategySelector(null,null,null);
        bootstrapServiceRegistryBuilder.applyStrategySelectors(null);


//        BootstrapServiceRegistry
        BootstrapServiceRegistry bootstrapServiceRegistry=bootstrapServiceRegistryBuilder.enableAutoClose().build();

//        StandardServiceRegistryBuilder
        StandardServiceRegistryBuilder standardServiceRegistryBuilder=new StandardServiceRegistryBuilder(bootstrapServiceRegistry);
        standardServiceRegistryBuilder.addInitiator(null);
        standardServiceRegistryBuilder.addService(null,null);
        standardServiceRegistryBuilder.applySetting(null,null);
        standardServiceRegistryBuilder.applySettings(null);

//        StandardServiceRegistry
        StandardServiceRegistry standardServiceRegistry=standardServiceRegistryBuilder.build();
        return null;
    }
}

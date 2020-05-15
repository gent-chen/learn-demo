package spring.ioc;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class TestInitializerClasses implements ApplicationContextInitializer{

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.addProtocolResolver(new ProtocolResolver() {
            @Override
            public Resource resolve(String location, ResourceLoader resourceLoader) {
                ClassLoader loader=resourceLoader.getClassLoader();
//                return loader.getResource(location);
                return null;
            }
        });
    }
}

package spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.web.context.support.AbstractRefreshableWebApplicationContext;

import java.io.Console;
import java.io.IOException;

public class TestParent extends AbstractRefreshableWebApplicationContext {
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException, IOException {
        beanFactory.addBeanPostProcessor(new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                System.getenv();
                return null;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                System.getProperties();
                char[] chars={95,96,97,98,99};
                char[] tos=new char[5];
                System.arraycopy(chars,0,tos,0,5);
                System.out.println(tos);
                Console console= System.console();
                console.printf("string chars number?0",0);
                return null;
            }
        });
    }
}

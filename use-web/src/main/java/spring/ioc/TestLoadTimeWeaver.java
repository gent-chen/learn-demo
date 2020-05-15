package spring.ioc;

import org.springframework.instrument.classloading.LoadTimeWeaver;

import java.lang.instrument.ClassFileTransformer;

public class TestLoadTimeWeaver implements LoadTimeWeaver {
    @Override
    public void addTransformer(ClassFileTransformer transformer) {
        System.out.println();
    }

    @Override
    public ClassLoader getInstrumentableClassLoader() {
        System.out.println();
        return null;
    }

    @Override
    public ClassLoader getThrowawayClassLoader() {
        System.out.println();
        return null;
    }
}

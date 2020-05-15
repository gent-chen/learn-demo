package spring.ioc;

import org.springframework.stereotype.Service;

@Service("1")
public class TestServiceImplCopy extends TestService{

    public String helloworld(){
        return "chen tai bai";
    }
}

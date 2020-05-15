package spring.ioc;

import org.springframework.stereotype.Service;

@Service("2")
public class TestServiceImpl  extends TestService{


    public String helloworld(){
        return "cjt";
    }
}

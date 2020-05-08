package spring.test;

import org.springframework.stereotype.Service;

@Service(value = "TestServiceImpl")
public class TestService {

    public String helloworld(){
        return "helloworld";
    }
}

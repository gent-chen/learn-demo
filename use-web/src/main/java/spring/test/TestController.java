package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public String show(){
        return service.helloworld();
    }
}

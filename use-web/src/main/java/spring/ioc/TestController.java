package spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/hello")
public class TestController {

    @Autowired
    @Qualifier("2")
    private TestService service;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public ModelAndView show(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("login");
        mav.addObject("name","chenjintao");
        return mav;
    }
}

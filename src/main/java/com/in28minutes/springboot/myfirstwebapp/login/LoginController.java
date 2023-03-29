package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    //GET, POST
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model) {
        model.put("name", "in28minutes");
        return "welcome";
    }


}

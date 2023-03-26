package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthenticationService authenticationService;

    //    http://localhost:8080/login?name=Ranga
    //    Model
    @RequestMapping("loginTest")
    public String gotoLoginPageTest(@RequestParam(value = "name", required = false) String name, ModelMap model) {
        model.put("name", name);

        logger.debug("Request param is {}", name);
        logger.info("Print param in info level {}", name);
        System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PRODUCTION CODE
        return "loginTest1";
    }

    //GET, POST
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password,
                                  ModelMap model) {
        model.put("name", name);
        model.put("password", password);


        //Authentication
        //valid name in28minutes
        //valid password - dummy
        if (authenticationService.authenticate(name, password)) {
            return "welcome";
        } else {
            model.put("errorMessage", "Invalid Credentials! Please try again.");
            return "login";
        }

    }
}

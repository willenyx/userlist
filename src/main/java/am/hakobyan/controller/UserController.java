package am.hakobyan.controller;

import am.hakobyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.processing.SupportedSourceVersion;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/registry")
    public String registry(){
        return "registry";
    }


    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.showAll());
        return "usersList";
    }
}

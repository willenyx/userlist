package am.hakobyan.controller;

import am.hakobyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



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


    @GetMapping("/list_of_users")
    public String getAllUsers(Model model){
        model.addAttribute("Nairi",userService.showAll());
//        model.addAttribute("Nairi",userService.createUser());
        return "list_of_users";
    }
}

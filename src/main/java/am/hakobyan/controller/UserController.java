package am.hakobyan.controller;

import am.hakobyan.entity.User;
import am.hakobyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;


@Controller

@RequestMapping("/")
public class UserController {


    @Qualifier("userServiceImpl")
    @Autowired
    private  UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registry")
    public String registry(User user){
        userService.saveUser(user);
        return "redirect:users";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.getAll());
        return "list_of_users";
    }

    @PostMapping("/registry")
    public String addUser(@ModelAttribute("users") User user){
        userService.saveUser(user);
        return "list_of_users";
    }
}

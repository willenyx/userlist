package am.hakobyan.controller;

import am.hakobyan.entity.User;
import am.hakobyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@ControllerAdvice
@RequestMapping("/")
public class UserController {
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/registry")
    public String registry(User user){
//        userService.createUser(user);
        return "registry";
    }

    @GetMapping("/list_of_users")
    public String getAllUsers(Model model){
        model.addAttribute("Nairi",userService.showAll());
        return "list_of_users";
    }

    @PostMapping("/registry")
    public String addUser(@ModelAttribute("user") User user){
//        userService.createUser(user);
        return "redirect:list_of_users";
    }
}

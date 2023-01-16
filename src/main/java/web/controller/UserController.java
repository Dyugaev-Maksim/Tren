package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.businesslogic.BusinessLogic;
import web.userService.UserService;
import web.model.User;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/user")
    String getCarList(Model model,
                      @RequestParam(value = "count", required = false) String count1) {
        UserService userService=new UserService();
        model.addAttribute("something", "User table");
        model.addAttribute("user", userService.logic(count1));
        return "user";
    }
}

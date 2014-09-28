package org.kingxkm.myblog.web;


import org.kingxkm.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    public String tuser(Model m) {
        System.out.println(userService.getAllUser());
        return "userService.getAllUser()";
    }

}
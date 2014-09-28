package org.kingxkm.myblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2014/9/25.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String goHome(Model m) {
        m.addAttribute("hello", "你好,This is a test.");
        System.out.println(m.getClass().toString());
        System.out.println("hello is added");
        return "home";
    }


}

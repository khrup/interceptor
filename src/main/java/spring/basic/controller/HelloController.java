package spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.basic.model.User;

@Controller
public class HelloController {

    @GetMapping("/Hello")
    @ResponseBody
    public String Hello() {
        return "Hello";
    }

    @GetMapping("Test")
    public String Test(Model model) {
        model.addAttribute("hi", "Hello World");
        model.addAttribute("user", new User("홍길동", 10));
        return "test/Test";
    }
}

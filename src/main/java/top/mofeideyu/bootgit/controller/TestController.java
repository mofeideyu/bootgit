package top.mofeideyu.bootgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("testColor")
    public String colorControl() {
        return "red";
    }

    @GetMapping("userInfo")
    public String getUserInfo() {
        return "users";
    }
}

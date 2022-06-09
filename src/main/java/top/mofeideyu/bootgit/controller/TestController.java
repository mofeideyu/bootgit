package top.mofeideyu.bootgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("testColor")
    public String colorControl() {
        return "red";
    }

    @GetMapping("resetColor")
    public String colorUpdateController() {
        System.out.println("color set other color");
        return "pink";
    }

    @GetMapping("delColor")
    public String colorDelController() {
        System.out.println("del color");
        return "pink";
    }
}

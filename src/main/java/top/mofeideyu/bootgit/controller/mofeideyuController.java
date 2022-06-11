package top.mofeideyu.bootgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mofeideyuController {

    @GetMapping("mofeideyu")
    public String getMoFeiInfo() {
        return "mofeideyu is ok";
    }

    @GetMapping("reset")
    public String resetInfo() {
        return "reset ok";
    }

}

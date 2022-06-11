package top.mofeideyu.bootgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MofeideyutopCOntroller {

    @GetMapping("mofeideyutop")
    public String getMofeideyutopInfo() {
        return "mofeideyutop is ok";
    }

    @GetMapping("restMofeitop")
    public String resetInfo() {
        return "reset ok";
    }

    @GetMapping("restMofeitop2")
    public String resetInfo2() {
        return "reset ok";
    }
}

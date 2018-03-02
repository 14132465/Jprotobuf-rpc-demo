package com.island.jprotobuf.rpc.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/developer")
public class DeveloperController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "testapi";
    }

}

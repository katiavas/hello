package com.dem.dem;
/*Home for the methods that will respond to specific paths requested by clients from our webserver*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    //Spring will call this method for all requests to the index path that uses HTTP get/receiving data
    /*@GetMapping(value = "/")
    @ResponseBody
    public String index(Model model){
        model.addAttribute("greetings", "Hello World");
        /*use specifiedname of template that you create==>use thymeleaf template to create more complex html documents
        return "index";
    }
}*/

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hell(@RequestParam (defaultValue = "world", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hell";
    }
}
/*@GetMapping(value = "/")
@ResponseBody
public String hello(Model model){
  model.addAttribute("name", name);
  return "hello";
 }
}*/





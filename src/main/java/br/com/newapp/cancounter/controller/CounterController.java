package br.com.newapp.cancounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api/counter")
public class CounterController {

    int count = 0;

    @GetMapping("/getCount")
    public Integer getCounter() {
        return count;
    }

    @GetMapping("/updateCount")
    public Integer updateCount() {
       count = count + 1;
       return count;
    }
}

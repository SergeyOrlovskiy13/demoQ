package com.example.demo.controllers;

import com.example.demo.service.TimeService;
import com.example.demo.service.entity.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class TimeController {

  @GetMapping(path = {"/", "/hello"})
    public String hello(Model model, @RequestParam(value = "product") int product){
    model.addAttribute("product",product);
    Response response = new Response();


    model.addAttribute("respon", Arrays.toString(TimeService.getLine(product)));
    int s = TimeService.out(TimeService.getLine(product));
    model.addAttribute("out", s);
      return "response";
  }
}

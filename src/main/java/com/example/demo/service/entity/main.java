package com.example.demo.service.entity;

import com.example.demo.service.TimeService;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Response[] res = TimeService.getLine(15);


        System.out.println(Arrays.toString(res));
        System.out.println(TimeService.out(res));
    }


}

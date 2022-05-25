package com.example.demo.service;

import com.example.demo.service.entity.Response;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeService {


    public static Response[] getLine(int line){
        Response [] res = new Response[line];
        for (int i=0; i<line; i++) {
            Response response = new Response();
            res[i] =response.createResponse();
        }
        return res;
    }

    public static int out(Response [] res){
        List<Response> list = Arrays.stream(res).collect(Collectors.toList());
        List<Response> list1= new ArrayList<>();

        String str ="D";
        int result = 0;
        for (int i = 0; i<res.length; i++){
            String target = list.get(i).getQuery();
            if (target==str) {
                list1.add(list.get(i));

            }
        }
        for (int i =0 ; i<list1.size(); i++){
            for (int y = 0 ; y<list.size();y++){
                if(list.get(y).getQuery()!=str && list1.get(i).getServiceId()==list.get(y).getServiceId()  ){
                    result =list1.get(i).getTime().getMinute()-list.get(y).getTime().getMinute();
                }
            }

        }

        return result;
    }

}

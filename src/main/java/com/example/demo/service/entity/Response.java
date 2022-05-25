package com.example.demo.service.entity;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Response  {
    private String query ;
    int serviceId;
    int varId;
    int questionId;
    int category;
    int subCategory;
    String responseType;
    LocalDate date;
    LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getQuery() {
        return query;
    }

    public Response createResponse(){
        Response response = new Response();
        String [] q ={"C","D"};
        String [] t = {"P","N"};
        Random random = new Random();
        response.query = q[random.nextInt(q.length)];
        response.serviceId= random.nextInt(10);
        response.varId= random.nextInt(3);
        response.questionId=random.nextInt(10);
        response.category=random.nextInt(20);
        response.subCategory= random.nextInt(5);
        response.responseType =t[random.nextInt(t.length)];
        response.date = LocalDate.now();
        if (response.getQuery()=="C"){
        response.time =LocalTime.now().plusMinutes(40);
        }   else  {
            response.time =LocalTime.now();
        }
        return response;
    }

    @Override
    public String toString() {
        int r= time.getMinute() ;
        return
               query +"."+ '\'' +serviceId + "."+
               varId +  "."+
                questionId +  "."+
                 category + "."+
                 subCategory +  "."+
               responseType +"."+ '\'' +
             date + '\'' +
                r +
                "\n";
    }
}

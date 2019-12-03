package com.durga;

import com.durga.lambda.LambdaService;
import com.durga.stream.StreamService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Java8Service {
    private StreamService streamService;
    private LambdaService lambdaService;

    private void performLambdaOperations(){
        lambdaService.performLambdaOperations();
    }
    private void performStreamOperations(){
        streamService.performStreamActivities();
    }

    public static void main(String args[]){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
        Java8Service java8Service=(Java8Service)applicationContext.getBean("java8Service");
        java8Service.performLambdaOperations();
        java8Service.performStreamOperations();

    }

    public void setLambdaService(LambdaService lambdaService) {
        this.lambdaService = lambdaService;
    }

    public void setStreamService(StreamService streamService) {
        this.streamService = streamService;
    }


}

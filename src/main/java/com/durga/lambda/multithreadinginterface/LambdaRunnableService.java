package com.durga.lambda.multithreadinginterface;

public class LambdaRunnableService {

    public void printRunnableInterfaceWithAndWithoutLambda(){
        System.out.println("----------------------------------------Lambda : Runnable Interface starts----------------------------------------\n");
        printUsingRunnableLambda_Method1();
        printUsingRunnableLambda_Method2();
        System.out.println("----------------------------------------Lambda : Runnable Interface ends----------------------------------------\n");
    }

    private void printUsingRunnableLambda_Method1(){
        Runnable r=()->System.out.println("4.1 Method1:This String is Printed using Runnable interface and Lambda function");
        Thread t=new Thread(r);
        t.start();
    }

    private void printUsingRunnableLambda_Method2(){
        Thread t=new Thread(()->System.out.println("4.2 Method2:This String is Printed using Runnable interface and Lambda function"));
        t.start();
    }
}

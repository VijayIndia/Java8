package com.durga.lambda.functionalinterface.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceWithReturnType {
    public int printSumUsingOrdinaryMethod(int a,int b);
    default void defaultMethod(){

    }

    public static void staticMethod(){

    }
}

package com.durga.lambda.functionalinterface.interfaces;

/**Functional Interface should contain only 1 Abstract Method and it can contain any number of Default and Static Methods**/
@FunctionalInterface
public interface FunctionalInterfaceWith1Parameter {

    public int printStringLength(String str);
    default void defaultMethod(){

    }

    public static void staticMethod(){

    }
}

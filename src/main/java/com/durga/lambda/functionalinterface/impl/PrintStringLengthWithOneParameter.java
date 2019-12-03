package com.durga.lambda.functionalinterface.impl;

import com.durga.lambda.functionalinterface.interfaces.FunctionalInterfaceWith1Parameter;

public class PrintStringLengthWithOneParameter implements FunctionalInterfaceWith1Parameter {
    public int printStringLength(String str){
        return str.length();
    }
}



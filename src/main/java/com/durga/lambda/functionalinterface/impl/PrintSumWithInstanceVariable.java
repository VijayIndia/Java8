package com.durga.lambda.functionalinterface.impl;
import com.durga.lambda.functionalinterface.interfaces.FunctionalInterfaceAccessingInstanceVariable;

public class PrintSumWithInstanceVariable implements FunctionalInterfaceAccessingInstanceVariable {
    public int threeSum(int local1,int local2){
        return local1+local2;
    }
}

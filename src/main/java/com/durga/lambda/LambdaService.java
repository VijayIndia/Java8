package com.durga.lambda;
import com.durga.lambda.collectioncomparatorinterface.LambdaComparatorService;
import com.durga.lambda.functionalinterface.LambdaFunctionalService;
import com.durga.lambda.multithreadinginterface.LambdaRunnableService;

public class LambdaService {
    private LambdaRunnableService runnableLambdaService;//This is for MultiThreading example
    private LambdaFunctionalService functionalInterfaceLambdaService;//This is for our own Custom Functional Interface
    private LambdaComparatorService comparatorLambdaService;//This is for Custom Sorting Interface

    public void performLambdaOperations(){
        functionalInterfaceLambdaService.printFunctionalInterfaceWithAndWithoutLambda();
        runnableLambdaService.printRunnableInterfaceWithAndWithoutLambda();
        comparatorLambdaService.printComparatorInterfaceWithAndWithoutLambda();
    }

    public void setComparatorLambdaService(LambdaComparatorService comparatorLambdaService) {
        this.comparatorLambdaService = comparatorLambdaService;
    }

    public void setFunctionalInterfaceLambdaService(LambdaFunctionalService functionalInterfaceLambdaService) {
        this.functionalInterfaceLambdaService = functionalInterfaceLambdaService;
    }

    public void setRunnableLambdaService(LambdaRunnableService runnableLambdaService) {
        this.runnableLambdaService = runnableLambdaService;
    }
}

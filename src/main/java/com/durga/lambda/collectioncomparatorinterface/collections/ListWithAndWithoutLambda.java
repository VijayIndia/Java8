package com.durga.lambda.collectioncomparatorinterface.collections;

import com.durga.lambda.collectioncomparatorinterface.impl.ComparatorImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListWithAndWithoutLambda {

    public void printListSortingWithAndWithoutLambda(){
        List<Integer> integerList=createList();
        printUsingComparatorImplementation(integerList);
        printUsingLambdaImplementation(integerList);
    }

    private List<Integer> createList(){
        List<Integer> integerList=new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(5);
        return integerList;
    }

    private void printUsingComparatorImplementation(List<Integer> integerList){
        Collections.sort(integerList,new ComparatorImplementation());
        System.out.println("5.1 List:Usual Way,Sorting List using Comparator by Usual way->"+integerList);
    }

    private void printUsingLambdaImplementation(List<Integer> integerList){
        Collections.sort(integerList,(I1,I2)->(I1>I2)?-1:((I1==I2)?0:1));
        System.out.println("5.2 List:Lambda Way,Sorting List using Comparator by Lambda way->"+integerList);
    }
}

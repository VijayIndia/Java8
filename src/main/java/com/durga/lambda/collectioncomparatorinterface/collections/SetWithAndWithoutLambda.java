package com.durga.lambda.collectioncomparatorinterface.collections;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Collections;

public class SetWithAndWithoutLambda {

    public void printSetSortingWithAndWithoutLambda() {
        printSortUsingComparator();
        printTreeSetSortUsingLambda();
    }

    private void printSortUsingComparator() {
        TreeSet<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 > i2 ? -1 : ((i1 < i2) ? 1 : 0);
            }
        });
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(10);
        System.out.println("6.1 TreeSet:UsualWay,Sorting TreeSet using Comparator by Usual way->" + treeSet);
    }

    private void printTreeSetSortUsingLambda(){
        Comparator<Integer> comparator=(i1,i2)->(i1 > i2)? -1 : ((i1 < i2) ? 1 : 0);
        TreeSet<Integer> treeSet=new TreeSet<Integer>(comparator);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(10);
        System.out.println("6.2 TreeSet:LambdaWay,Sorting TreeSet using Comparator by Lambda way->"+treeSet);
    }

}

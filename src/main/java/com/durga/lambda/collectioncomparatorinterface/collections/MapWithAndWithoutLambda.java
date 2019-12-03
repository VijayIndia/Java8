package com.durga.lambda.collectioncomparatorinterface.collections;
import java.util.Comparator;
import java.util.TreeMap;
public class MapWithAndWithoutLambda {

    public void printUsingMapComparator(){
        printTreeMapSortUsingComparator();
        printTreeMapSortUsingLambdaComparator();
    }

    private void printTreeMapSortUsingComparator(){
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return (i1>i2)?-1:((i1<i2)?1:0);
            }
        });
        treeMap.put(1,"India");
        treeMap.put(3,"Vijay");
        treeMap.put(2,"Manohar");
        System.out.println("7.1 TreeMap:Usual Way,Sorting TreeMap using Comparator by Usual way->"+treeMap);
    }

    private void printTreeMapSortUsingLambdaComparator(){
        Comparator<Integer> comparator=(i1,i2)->(i1>i2)?-1:((i1<i2)?1:0);
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>(comparator);
        treeMap.put(1,"India");
        treeMap.put(3,"Vijay");
        treeMap.put(2,"Manohar");
        System.out.println("7.2 TreeMap:Lambda Way,Sorting TreeMap using Comparator by Lamda way->"+treeMap);
    }

}

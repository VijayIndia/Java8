package com.durga.stream.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapList {
    private List<Integer> arrList=CreateNumberedList.getArrList();

    public void performFilterList(){
        System.out.println("----------------------------------------Stream : Map List Starts----------------------------------------");
        printMapUsingOrdinaryWay();
        printMapUsingStreamWay();
        System.out.println("----------------------------------------Stream : Map List ends----------------------------------------");
    }

    private void printMapUsingOrdinaryWay(){
        List<Integer> newOrdinaryList=new ArrayList<Integer>();
        for(Integer i:arrList){
                newOrdinaryList.add(i*2);
        }
        System.out.println("Map:Ordinary Way,New List Containing Mapped Elements->"+newOrdinaryList);
    }

    private void printMapUsingStreamWay(){
        List<Integer> newOrdinaryList=arrList.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Map:Stream Way,New List Containing Mapped Elements->"+newOrdinaryList);
    }
}

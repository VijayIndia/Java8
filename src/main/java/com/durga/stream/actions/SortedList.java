package com.durga.stream.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    private List<Integer> arrList=createList();
    private List<Integer> createList(){
        arrList=new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(9);
        arrList.add(3);
        arrList.add(8);
        arrList.add(10);
        arrList.add(6);
        arrList.add(2);
        arrList.add(4);
        arrList.add(5);
        arrList.add(7);
        return arrList;
    }
    public void performSortedList(){
        System.out.println("----------------------------------------Stream : Sort List starts----------------------------------------");
        List<Integer> defaultSorting=arrList.stream().sorted().collect(Collectors.toList());
        List<Integer> reverseSorting=arrList.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Sorted:Stream Way,Ascending Sorted List ->"+defaultSorting+" and in reverse Sorted List ->"+reverseSorting);
        System.out.println("----------------------------------------Stream : Sort List ends----------------------------------------");

    }

}

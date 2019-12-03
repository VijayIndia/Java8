package com.durga.stream.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    private List<Integer> arrList=CreateNumberedList.getArrList();

    public void performSortedList(){
        System.out.println("----------------------------------------Stream : Sort List starts----------------------------------------");
        List<Integer> defaultSorting=arrList.stream().sorted().collect(Collectors.toList());
        List<Integer> reverseSorting=arrList.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Sorted:Stream Way,Ascending Sorted List ->"+defaultSorting+" and in reverse Sorted List ->"+reverseSorting);
        System.out.println("----------------------------------------Stream : Sort List ends----------------------------------------");

    }

}

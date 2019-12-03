package com.durga.stream.actions;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

//This is used inorder to filter the elements in the current List
public class FilterList {

    private List<Integer> arrList=createList();
    List<String> namesList=createNamesList();

    private List<Integer> createList(){
        arrList=new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(8);
        arrList.add(9);
        arrList.add(10);
        return arrList;
    }
    private List<String> createNamesList(){
        namesList=new ArrayList<String>();
        namesList.add("RaviTeja");
        namesList.add("Venkatesh");
        namesList.add("Chiranjeevi");
        namesList.add("Pavan");
        namesList.add("Nagarjuna");
        return namesList;
    }

    public void performFilterList(){
        System.out.println("----------------------------------------Stream : Filter List starts----------------------------------------");
        printFilterUsingOrdinaryWay();
        printFilterUsingStreamWay();
        printFilterCountUsingStreamWay();
        System.out.println("----------------------------------------Stream : Filter List ends----------------------------------------");
    }

    private void printFilterUsingOrdinaryWay(){
        List<Integer> newOrdinaryList=new ArrayList<Integer>();
        for(Integer i:arrList){
                if(i%2==0){
                    newOrdinaryList.add(i);
                }
            }
        System.out.println("Filter:Ordinary Way,New List Containing Filtered Elements->"+newOrdinaryList);
    }

    private void printFilterUsingStreamWay(){
        List<Integer> newOrdinaryList=arrList.stream().filter(i->(i%2==0)).collect(Collectors.toList());
        System.out.println("Filter:Stream Way,New List Containing Filtered Elements->"+newOrdinaryList);
    }

    private void printFilterCountUsingStreamWay(){
        long count=namesList.stream().filter(s->s.length()>=9).count();
        System.out.println("Filter:Stream Way,Count of List matching Filtered Criteria->"+count);
    }


}

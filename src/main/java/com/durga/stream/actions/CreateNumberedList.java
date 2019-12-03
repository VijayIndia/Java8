package com.durga.stream.actions;
import java.util.List;
import java.util.ArrayList;

public class CreateNumberedList {

    private static List<Integer> arrList;

    public static List<Integer> getArrList() {
        if (arrList == null) {
            arrList = new ArrayList<Integer>();
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
        }
        return arrList;
    }
}

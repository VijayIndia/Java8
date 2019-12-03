package com.durga.stream;

import com.durga.stream.actions.FilterList;
import com.durga.stream.actions.MapList;
import com.durga.stream.actions.SortedList;

public class StreamService {

    private FilterList filterList;
    private MapList mapList;
    private SortedList sortedList;

    public void performStreamActivities(){
        System.out.println("----------------------------------------Stream : starts----------------------------------------");
        filterList.performFilterList();
        mapList.performFilterList();
        sortedList.performSortedList();
        System.out.println("----------------------------------------Stream : ends----------------------------------------");

    }

    public void setMapList(MapList mapList) {
        this.mapList = mapList;
    }

    public void setFilterList(FilterList filterList) {
        this.filterList = filterList;
    }

    public void setSortedList(SortedList sortedList) {
        this.sortedList = sortedList;
    }
}

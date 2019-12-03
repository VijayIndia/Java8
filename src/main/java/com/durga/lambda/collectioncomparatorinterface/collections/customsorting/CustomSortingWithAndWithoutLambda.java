package com.durga.lambda.collectioncomparatorinterface.collections.customsorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class CustomSortingWithAndWithoutLambda {

    public void printSortbyEmployeeId(){
        List<EmployeeBean> employeeBeanList=createEmployeeList();
        System.out.println("8. Before Sorting EmployeeList using Comparator ->"+employeeBeanList);
        printSortByEmployeeIdComparator(employeeBeanList);
        System.out.println("8.1 Object:Usual Way,Sorting EmployeeList using Comparator by Usual way->"+employeeBeanList);
        employeeBeanList=createEmployeeList();
        printSortbyEmployeeIdLambda(employeeBeanList);
        System.out.println("8.2 Object:Lambda Way,Sorting EmployeeList using Comparator by Lamda way->"+employeeBeanList);
    }

    private List<EmployeeBean> createEmployeeList(){
        List<EmployeeBean> employeeBeanList=new ArrayList<EmployeeBean>();
        EmployeeBean emp1=new EmployeeBean(1,"Vijay");
        EmployeeBean emp2=new EmployeeBean(2,"Ram");
        EmployeeBean emp3=new EmployeeBean(3,"Salman");
        employeeBeanList.add(emp1);
        employeeBeanList.add(emp2);
        employeeBeanList.add(emp3);
        return employeeBeanList;
    }

    private void printSortByEmployeeIdComparator(List<EmployeeBean> employeeBeanList){
        Collections.sort(employeeBeanList, new Comparator<EmployeeBean>() {
            @Override
            public int compare(EmployeeBean e1, EmployeeBean e2) {
                return e1.pid>e2.pid?-1:((e1.pid<e2.pid)?1:0);
            }
        });
    }

    private void printSortbyEmployeeIdLambda(List<EmployeeBean> employeeBeanList){
       /**Method 1 ,By assinging Lambda Expression to Comparator **/
        Comparator<EmployeeBean> comparator=(e1,e2)->(e1.pid>e2.pid?-1:(e1.pid<e2.pid?1:0));
        Collections.sort(employeeBeanList,comparator);
        /**Method 2 ,By Passing Lambda Expression instead of Comparator **/
        Collections.sort(employeeBeanList,(e1,e2)->(e1.pid>e2.pid?-1:(e1.pid<e2.pid?1:0)));
    }
}

package com.durga.lambda.collectioncomparatorinterface.collections.customsorting;

public class EmployeeBean {
    int pid;
    String name;

    public EmployeeBean(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "pid->"+pid+",name->"+name;
    }
}

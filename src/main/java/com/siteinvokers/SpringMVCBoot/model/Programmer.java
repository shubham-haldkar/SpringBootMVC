package com.siteinvokers.SpringMVCBoot.model;

public class Programmer {
    private int pid;
    private String pname ;
    
    public Programmer(int pid, String pname) {
        this.pid = pid;
        this.pname = pname ;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    @Override
    public String toString() {
        return "Programmer [pid=" + pid + ", pname=" + pname + "]";
    }
    
    

}

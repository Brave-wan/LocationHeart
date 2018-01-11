package com.jinke.location.bean;

public class User {
    private String[] arrays;
    private int i;
    private String xuweijei;
    private String xuwiejei;
    private String xwj;
    private String nan;
    private String s;
    private String zhuhai;

    public User(int i, String xuweijei, String xuwiejei, String xwj, String nan, String s, String zhuhai) {
        this.i=i;
        this.xuweijei=xuweijei;
        this.xuwiejei=xuwiejei;
        this.xwj=xwj;
        this.nan=nan;
        this.s=s;
        this.zhuhai=zhuhai;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public String[] getArrays() {
        return arrays;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getXuweijei() {
        return xuweijei;
    }

    public void setXuweijei(String xuweijei) {
        this.xuweijei = xuweijei;
    }

    public String getXuwiejei() {
        return xuwiejei;
    }

    public void setXuwiejei(String xuwiejei) {
        this.xuwiejei = xuwiejei;
    }

    public String getXwj() {
        return xwj;
    }

    public void setXwj(String xwj) {
        this.xwj = xwj;
    }

    public String getNan() {
        return nan;
    }

    public void setNan(String nan) {
        this.nan = nan;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getZhuhai() {
        return zhuhai;
    }

    public void setZhuhai(String zhuhai) {
        this.zhuhai = zhuhai;
    }
}

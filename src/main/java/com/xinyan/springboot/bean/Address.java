package com.xinyan.springboot.bean;

public class Address {

    private String homeAddr;
    private String companyAddr;

    @Override
    public String toString() {
        return "Address{" +
                "homeAddr='" + homeAddr + '\'' +
                ", companyAddr='" + companyAddr + '\'' +
                '}';
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }
}

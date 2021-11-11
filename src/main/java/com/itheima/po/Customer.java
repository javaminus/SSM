package com.itheima.po;


import java.util.List;

/**
 * @author Minus
 */
public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;
    private List<BookStore> bookStoreList;
    private List<CustomerWithBook> customerWithBookList;

    @Override
    public String toString() {
        return "顾客:"+username+"      职业:"+jobs+"     电话："+phone+"\n";
    }
    public String toString1() {
        return "顾客:"+username+"      职业:"+jobs+"     电话："+phone+"\n"
                +"购书记录:"+"\n"+bookStoreList;
    }

    public List<BookStore> getBookStoreList() {
        return bookStoreList;
    }

    public void setBookStoreList(List<BookStore> bookStoreList) {
        this.bookStoreList = bookStoreList;
    }

    public List<CustomerWithBook> getCustomerWithBookList() {
        return customerWithBookList;
    }

    public void setCustomerWithBookList(List<CustomerWithBook> customerWithBookList) {
        this.customerWithBookList = customerWithBookList;
    }

    public Customer() {
    }

    public Customer(Integer id, String username, String jobs, String phone) {
        this.id = id;
        this.username = username;
        this.jobs = jobs;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

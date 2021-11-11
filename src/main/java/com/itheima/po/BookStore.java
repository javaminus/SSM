package com.itheima.po;


import java.util.List;

/**
 * @author Minus
 */
public class BookStore {
    private Integer id;
    private String name;
    private String author;
    private String press;
    private Integer amount;
    private List<Customer> customerList;
    private List<CustomerWithBook> customerWithBookList;

    @Override
    public String toString() {
        return "      书名:"+name+";     数量："+customerWithBookList+";      出版社:"+press+";     作者："+author+"\n";
    }
    public String toString1() {
        return "书名:"+name+";      出版社:"+press+";     作者："+author+"\n"+customerList;
    }


    public List<CustomerWithBook> getCustomerWithBookList() {
        return customerWithBookList;
    }

    public void setCustomerWithBookList(List<CustomerWithBook> customerWithBookList) {
        this.customerWithBookList = customerWithBookList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }


    public BookStore() {
    }

    public BookStore(Integer id, String name, String author, String press, Integer amount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


}

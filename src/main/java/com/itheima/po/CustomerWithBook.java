package com.itheima.po;

/**
 * @author Minus
 */
public class CustomerWithBook {
    private Integer id;
    private Integer bookStore_id;
    private Integer customer_id;
    private Integer number;

    public String toString1() {
        return "CustomerWithBook{" +
                "id=" + id +
                ", bookStore_id=" + bookStore_id +
                ", customer_id=" + customer_id +
                ", number=" + number +
                '}';
    }

    @Override
    public String toString() {
        return number+"本";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookStore_id() {
        return bookStore_id;
    }

    public void setBookStore_id(Integer bookStore_id) {
        this.bookStore_id = bookStore_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

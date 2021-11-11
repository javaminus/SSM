package com.itheima.service;

import com.itheima.po.BookStore;
import com.itheima.po.Customer;
import com.itheima.po.CustomerWithBook;

import java.util.List;

/**
 * @author Minus
 */
public interface BookService {
    /**
     *
     * @param name
     * @param amount
     * @return
     */
    public int addBookByName(String name,Integer amount);

    /**
     *
     * @param customer_id
     * @param bookstore_id
     * @param number
     * @return
     */
    public int updateBookByCustomerId(Integer customer_id,Integer bookstore_id,Integer number);

    public Customer findBookStoreByCustomerName(String username);

    public List<BookStore> findAllBook();

    public BookStore findCustomerByBookStoreName(String name);
    public void insertIntoId(Integer customer_id,Integer bookstore_id,Integer number);
    public Integer findBookIdByName(String name);
    public Integer findIdByUsername(String username);


}

package com.itheima.service;

import com.itheima.mapper.BookCustomerMapper;
import com.itheima.mapper.BookMapper;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.BookStore;
import com.itheima.po.Customer;
import com.itheima.po.CustomerWithBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Minus
 */
@Transactional
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public int addBookByName(String name,Integer amount) {
        int num1=this.bookMapper.addBookByName(name,amount);
        //int i=1/0;
        return num1;
    }
    @Autowired
    private BookCustomerMapper bookCustomerMapper;
    @Override
    public int updateBookByCustomerId(Integer customer_id, Integer bookstore_id,Integer number) {
        int num2=this.bookCustomerMapper.updateBookByCustomerId(customer_id,bookstore_id,number);
        //int i=1/0;
        return num2;
    }
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Customer findBookStoreByCustomerName(String username) {
        return this.customerMapper.findBookStoreByCustomerName(username);
    }

    @Override
    public List<BookStore> findAllBook() {
        return (List<BookStore>) this.bookMapper.findAllBook();
    }

    @Override
    public BookStore findCustomerByBookStoreName(String name) {
        return this.bookMapper.findCustomerByBookStoreName(name);
    }

    @Override
    public void insertIntoId(Integer customer_id,Integer bookstore_id,Integer number) {
        this.bookCustomerMapper.insertIntoId(customer_id,bookstore_id,number);
    }

    @Override
    public Integer findBookIdByName(String name) {
        return this.bookMapper.findBookIdByName(name);
    }

    @Override
    public Integer findIdByUsername(String username) {
        return this.customerMapper.findIdByUsername(username);
    }


}

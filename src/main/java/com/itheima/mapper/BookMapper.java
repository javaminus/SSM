package com.itheima.mapper;

import com.itheima.po.BookStore;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

/**
 * @author Minus
 */
public interface BookMapper {
    /**
     *
     * @param name
     * @param amount
     * @return
     */
    public int addBookByName(@Param("name") String name,@Param("amount") Integer amount);

    /**
     *
     * @param name
     * @return
     */
    public BookStore findCustomerByBookStoreName(String name);
    public List<BookStore> findAllBook();
    public Integer findBookIdByName(String name);
}

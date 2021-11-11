package com.itheima.mapper;


import com.itheima.po.CustomerWithBook;
import org.apache.ibatis.annotations.Param;

/**
 * @author Minus
 */
public interface BookCustomerMapper {
    /**
     *
     * @param customer_id
     * @param bookstore_id
     * @param number
     * @return
     */
    public int updateBookByCustomerId(Integer customer_id,Integer bookstore_id,Integer number);
    public void insertIntoId(@Param("customer_id") Integer customer_id,@Param("bookstore_id") Integer bookstore_id,@Param("number") Integer number);
}


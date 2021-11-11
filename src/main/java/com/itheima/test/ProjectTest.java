package com.itheima.test;


import com.itheima.mapper.BookMapper;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.BookStore;
import com.itheima.po.Customer;
import com.itheima.po.CustomerWithBook;
import com.itheima.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Minus
 */
public class ProjectTest {
    @Test
    public void findBookStoreByCustomerIdTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerMapper customerMapper = (CustomerMapper) applicationContext.getBean("customerMapper");
        Customer customer = customerMapper.findBookStoreByCustomerName("张三");
        System.out.println(customer.toString1());
    }

    @Test
    public void findCustomerByBookStoreNameTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookMapper=(BookMapper) applicationContext.getBean("bookMapper");
        BookStore bookStore=bookMapper.findCustomerByBookStoreName("java基础案例教程1");
        System.out.println(bookStore.toString1());
    }
    @Test
    public void addBookByCustomerNameTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerMapper customerMapper=(CustomerMapper) applicationContext.getBean("customerMapper");
        BookMapper bookMapper1=(BookMapper) applicationContext.getBean("bookMapper");
        BookService bookMapper=(BookService) applicationContext.getBean("bookService");
        BookService bookCustomerMapper=(BookService) applicationContext.getBean("bookService");

        //顾客姓名
        Customer customer = customerMapper.findBookStoreByCustomerName("张三");
        //书籍名称
        BookStore bookStore=bookMapper1.findCustomerByBookStoreName("java基础案例教程1");
        CustomerWithBook customerWithBook=new CustomerWithBook();
        //需要购买书籍的数量
        customerWithBook.setNumber(6);
        customerWithBook.setCustomer_id(customer.getId());
        customerWithBook.setBookStore_id(bookStore.getId());
        int num1=bookMapper.addBookByName(bookStore.getName(), customerWithBook.getNumber());
        int num2=bookCustomerMapper.updateBookByCustomerId(bookStore.getId(),customer.getId(),customerWithBook.getNumber());
        if (num1 > 0 && num2 > 0) {
            System.out.println("购买成功");
        } else {
            System.out.println("购书失败！！！");
        }
        Customer customer1 = customerMapper.findBookStoreByCustomerName(customer.getUsername());
        System.out.println(customer1.toString1());
    }
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerMapper customerMapper=(CustomerMapper) applicationContext.getBean("customerMapper");
        BookMapper bookMapper1=(BookMapper) applicationContext.getBean("bookMapper");
        BookService bookMapper=(BookService) applicationContext.getBean("bookService");
        BookService bookCustomerMapper=(BookService) applicationContext.getBean("bookService");
        CustomerWithBook customerWithBook=new CustomerWithBook();
        //需要购买书籍的数量
        customerWithBook.setNumber(6);
        //顾客姓名
        Customer customer = customerMapper.findBookStoreByCustomerName("张三");
        int var1=customerMapper.findIdByUsername(customer.getUsername());
        System.out.println(var1);
        int var2=bookMapper.findBookIdByName("计算机网络");
        System.out.println(var2);
        //书籍名称
        BookStore bookStore=bookMapper1.findCustomerByBookStoreName("计算机网络");
        if(bookStore==null){
            bookCustomerMapper.insertIntoId(var1,var2,customerWithBook.getNumber());
        }else{
        int num1=bookMapper.addBookByName(bookStore.getName(), customerWithBook.getNumber());
        int num2=bookCustomerMapper.updateBookByCustomerId(bookStore.getId(),customer.getId(),customerWithBook.getNumber());
        if (num1 > 0 && num2 > 0) {
            System.out.println("购买成功");
        } else {
            System.out.println("购书失败！！！");
        }
        /*Customer customer1 = customerMapper.findBookStoreByCustomerName(customer.getUsername());
        System.out.println(customer1.toString1());*/
        }
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookMapper=(BookService) applicationContext.getBean("bookService");
        BookService bookCustomerMapper=(BookService) applicationContext.getBean("bookService");
        bookCustomerMapper.insertIntoId(5,6,6);
    }
}



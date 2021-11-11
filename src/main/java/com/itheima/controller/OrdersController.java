package com.itheima.controller;

import com.itheima.mapper.CustomerMapper;
import com.itheima.po.BookStore;
import com.itheima.po.Customer;
import com.itheima.po.CustomerWithBook;
import com.itheima.service.BookService;
import com.itheima.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Minus
 * @date 2021/11/8 13:37
 */
@Controller
public class OrdersController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/tofindOrdersByUsername")
    public String tofindOrdersByUsername() {
        return "findOrders";
    }

    @RequestMapping("/findOrdersByUsername")
    public String findOrdersByUsername(Customer customer, Model model) {
        String username=customer.getUsername();
        Customer customer1=bookService.findBookStoreByCustomerName(username);
        System.out.println(customer1.toString1());
        model.addAttribute("customer1",customer1);
        List list=new ArrayList();
        for (BookStore bookStore : customer1.getBookStoreList()) {
            list.add(bookStore.getCustomerWithBookList());
        }
        model.addAttribute("BookNumber",list);
        System.out.println("list集合："+list);
        return "cart";
    }
    @RequestMapping("/tofindBookStore")
    public String tofindBookStore(String username,Model model){
        List<BookStore> bookStoreList=bookService.findAllBook();
        System.out.println(username);
        model.addAttribute("username",username);
        model.addAttribute("allBook",bookStoreList);
        return "bookStore";
    }
    @RequestMapping("/toFunction")
    public String toFunction(String username,String bookName,Model model){
        System.out.println(username);
        System.out.println(bookName);
        model.addAttribute("username",username);
        model.addAttribute("bookName",bookName);
        return "function";
    }
    @RequestMapping("/buyBook")
    public String buyBook(String username,String name,Integer number){
        int var1=bookService.findIdByUsername(username);
        int var2=bookService.findBookIdByName(name);
        Customer customer = bookService.findBookStoreByCustomerName(username);
        //书籍名称
        BookStore bookStore=bookService.findCustomerByBookStoreName(name);
        if(bookStore==null){
            bookService.insertIntoId(var1,var2,number);
        }else{
            int num1=bookService.addBookByName(name, number);
            int num2=bookService.updateBookByCustomerId(bookStore.getId(),customer.getId(),number);
            if (num1 > 0 && num2 > 0) {
                System.out.println("购买成功");
            } else {
                System.out.println("购书失败！！！");
            }
        }

        return "success";
    }
}

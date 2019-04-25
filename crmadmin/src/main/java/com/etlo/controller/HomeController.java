package com.etlo.controller;

import com.etlo.model.Product;
import com.etlo.service.ProductService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    @RequestMapping("/login")
    public String login(){
        DateTime time=new DateTime();
        System.out.println(time.getDayOfWeek());
        Product product=productService.selectByPrimaryKey(1);
        System.out.println(product.getName().toString());
        return "/login";
    }

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }
}

package com.itheima.controller;

import com.itheima.ssm.domain.Account;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.OrdersService;
import com.itheima.ssm.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    //查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = service.findAll();
        mv.addObject("productList", ps);
        mv.setViewName("product-list");
        return mv;

    }
    //新建产品
    @RequestMapping("/save.do")
    public String save(Product product){
        service.save(product);
        return "redirect:findAll";
    }


}

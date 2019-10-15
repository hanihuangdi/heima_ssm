package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.ssm.dao.OrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    //查询所有订单
//    @RequestMapping("/findAll.do")
//    public ModelAndView findAll(){
//        List<Orders> orders = ordersService.findAll();
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("ordersList",orders);
//        mv.setViewName("orders-list");
//        return mv;
//    }
    @RequestMapping("/findAll.do")
    public ModelAndView findById(@RequestParam(name="page",required = true,defaultValue = "1")int pageNum,
                                 @RequestParam(name="size",required = true,defaultValue = "4")int pageSize){
        ModelAndView mv = new ModelAndView();
        List<Orders> orders = ordersService.findAll(pageNum,pageSize);
        PageInfo info = new PageInfo(orders);
        mv.setViewName("orders-page-list");
        mv.addObject("pageInfo",info);
        return mv;
    }


    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name="id",required = true) String ordersId){
        ModelAndView mv = new ModelAndView();
        Orders od = ordersService.findById(ordersId);
        mv.addObject("orders",od);
        mv.setViewName("orders-show");
        return mv;
    }


}

package com.itheima.ssm.service.imp;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.OrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImp implements OrdersService {
    @Autowired
   private OrdersDao dao;


    @Override
    public Orders findById(String ordersId) {
        Orders od=  dao.findById(ordersId);
        return od;
    }

    @Override
    public List<Orders> findAll(int num,int size) {
        PageHelper.startPage(num, size);
        List<Orders> orders = dao.findAll();
        return orders;
    }
}

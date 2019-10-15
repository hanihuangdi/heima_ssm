package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

public interface OrdersService {
    public Orders findById(String ordersId);

    List<Orders> findAll(int num,int size);


}

package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Account;
import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ProductDao {
    @Select("select * from product")
    public List<Product> findAll();
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
    @Select("select * from product where id =#{id}")
    Product findById(String id);
}

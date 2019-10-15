package com.itheima.ssm.service.imp;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Account;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductDao dao;
    @Override
    public List<Product> findAll() {
        List<Product> pds = dao.findAll();
        return pds;
    }

    @Override
    public void save(Product product) {
        dao.save(product);
    }
}

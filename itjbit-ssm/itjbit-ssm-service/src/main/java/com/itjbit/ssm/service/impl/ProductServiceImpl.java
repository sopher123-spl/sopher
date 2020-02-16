package com.itjbit.ssm.service.impl;

import com.itjbit.ssm.dao.IProductDao;
import com.itjbit.ssm.domain.Product;
import com.itjbit.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;


    public List<Product> findAll() {
        return productDao.findAll();
    }
}

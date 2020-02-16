package com.itjbit.ssm.dao;

import com.itjbit.ssm.domain.Product;

import java.util.List;

public interface IProductDao {
    public List<Product> findAll();
}

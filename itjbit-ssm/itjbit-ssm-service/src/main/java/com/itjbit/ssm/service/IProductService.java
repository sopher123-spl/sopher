package com.itjbit.ssm.service;

import com.itjbit.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
}

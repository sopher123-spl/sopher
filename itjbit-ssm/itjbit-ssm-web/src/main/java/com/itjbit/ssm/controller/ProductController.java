package com.itjbit.ssm.controller;

import com.itjbit.ssm.domain.Product;
import com.itjbit.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @RequestMapping("/find")
    public ModelAndView findAll(){
        ModelAndView mv= new ModelAndView();
        List<Product> pros = productService.findAll();
        mv.addObject("productList",pros);
        mv.setViewName("product-list");
        return mv;
    }

}

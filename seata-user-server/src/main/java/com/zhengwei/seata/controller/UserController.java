package com.zhengwei.seata.controller;

import com.zhengwei.seata.entity.Product;
import com.zhengwei.seata.service.ProductService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private ProductService productService;

    /**
     * 分布式事务中途修改数据怎么回滚
     * @return
     */
    @GetMapping(value = "testUpdate")
//    @GlobalTransactional
    public Object testUpdate(){
        Product product = productService.getById(1);
        product.setStock(product.getStock() - 1);
        productService.updateById(product);
        return true;
    }
}

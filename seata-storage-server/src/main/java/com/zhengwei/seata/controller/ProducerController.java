package com.zhengwei.seata.controller;

import com.zhengwei.seata.entity.Product;
import com.zhengwei.seata.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ${description}
 *
 * @author zhengwei 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/5/22 11:45
 **/
@RestController
@Slf4j
public class ProducerController {

    @Autowired
    ProductService productService;

    @RequestMapping("/getById")
    public Product getById(@RequestParam(name = "id") Integer id) {
        return productService.getById(id);
    }

    @RequestMapping("/updateById")
    public Boolean updateById(@RequestBody Product product) {
        log.info("product:{}", product);
        return productService.updateById(product);
    }

    /**
     * 分布式事务中途修改数据怎么回滚
     * @return
     */
    @GetMapping(value = "testUpdate")
    public Object testUpdate(){
        log.info("testUpdate begin");
        Product product = productService.getById(1);
        product.setStock(product.getStock() - 1);
        productService.updateById(product);
        log.info("testUpdate end");
        return true;
    }
}
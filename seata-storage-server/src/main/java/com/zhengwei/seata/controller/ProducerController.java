package com.zhengwei.seata.controller;

import com.zhengwei.seata.entity.Product;
import com.zhengwei.seata.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
}
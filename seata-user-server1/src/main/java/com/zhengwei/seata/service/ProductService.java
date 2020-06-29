package com.zhengwei.seata.service;

import com.zhengwei.seata.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:45
 **/
@FeignClient(value = "seata-storage-server")
public interface ProductService{

    @RequestMapping("/getById")
    Product getById(@RequestParam(name = "id") Integer id);

    @RequestMapping("/updateById")
    Boolean updateById(@RequestBody Product product);
}


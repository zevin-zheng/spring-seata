package com.zhengwei.seata.service;

import com.zhengwei.seata.entity.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:15
 **/
@FeignClient(value = "seata-order-server")
public interface OrderService{

    @RequestMapping(value = "/save")
    Boolean save(@RequestBody Orders orders);
}

package com.zhengwei.seata.controller;

import com.zhengwei.seata.entity.Orders;
import com.zhengwei.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${description}
 *
 * @author zhengwei 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/5/22 11:45
 **/
@RestController
public class ProducerController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/save")
    public Boolean save(@RequestBody Orders orders) {
        return orderService.save(orders);
    }
}

package com.zhengwei.seata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengwei.seata.entity.Orders;
import com.zhengwei.seata.mapper.OrdersMapper;
import com.zhengwei.seata.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:17
 **/
@Service
public class OrderServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrderService {
}

package com.zhengwei.seata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengwei.seata.entity.Product;
import com.zhengwei.seata.mapper.ProductMapper;
import com.zhengwei.seata.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:45
 **/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}

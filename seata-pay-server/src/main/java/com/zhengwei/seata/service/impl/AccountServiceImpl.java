package com.zhengwei.seata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengwei.seata.entity.Account;
import com.zhengwei.seata.mapper.AccountMapper;
import com.zhengwei.seata.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:42
 **/
@Service
public class AccountServiceImpl  extends ServiceImpl<AccountMapper, Account> implements AccountService {

}

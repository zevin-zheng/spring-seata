package com.zhengwei.seata.controller;

import com.zhengwei.seata.entity.Account;
import com.zhengwei.seata.service.AccountService;
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
public class ProducerController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/getById")
    public Account getById(@RequestParam Integer id) {
        return accountService.getById(id);
    }

    @RequestMapping("/updateById")
    public Boolean updateById(@RequestBody Account account) {
        return accountService.updateById(account);
    }
}

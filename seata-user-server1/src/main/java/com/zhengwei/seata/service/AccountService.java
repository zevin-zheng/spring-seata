package com.zhengwei.seata.service;

import com.zhengwei.seata.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:41
 **/
@FeignClient(value = "seata-pay-server")
public interface AccountService{

    @RequestMapping(value = "/getById")
    Account getById(@RequestParam(value = "id") Integer id);

    @RequestMapping(value = "/updateById")
    Boolean updateById(@RequestBody Account account);
}


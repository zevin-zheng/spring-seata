package com.zhengwei.seata.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:39
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private Integer sum;

    private LocalDateTime lastUpdateTime;
}

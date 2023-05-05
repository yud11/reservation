package com.fudan.reservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @autor yud1
 * @date 2023/5/5 21:01
 */
@Data
public class Student extends BaseEntity{


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    public Long id;

    public String name;

    /**
     * 学号
     */
    public String stuNumber;

    public String email;

    /**
     * 密码
     */
    public String password;

    public String phone;

    /**
     * 违约次数
     */
    public Integer defaultCount;

}

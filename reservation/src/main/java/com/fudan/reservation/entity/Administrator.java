package com.fudan.reservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @autor yud1
 * @date 2023/5/5 21:21
 */
@Data
public class Administrator extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name; // 姓名

    private String email; // 邮箱

    private String password; // 密码

}

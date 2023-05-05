package com.fudan.reservation.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * @autor yud1
 * @date 2023/5/5 20:57
 */
@Data
public class BaseEntity {

    /**
     * 创建记录时间
     */
    @TableField(fill = FieldFill.INSERT)
    public Date createTime;

    /**
     * 更新记录时间
     */
    @TableField(fill = FieldFill.UPDATE)
    public Date updateTime;
}

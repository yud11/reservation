package com.fudan.reservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @autor yud1
 * @date 2023/5/5 21:06
 */
@Data
public class Room extends BaseEntity {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    public Long id;

    public String name;


    /**
     * 位置
     */
    public String location;

    /**
     * 容量
     */
    public String capacity;

    /**
     * 开放时间
     */
    public Date open_time;

    /**
     * 关闭时间
     */
    public Date close_time;

    /**
     * 是否可用
     */
    public boolean available;


    /**
     * 最大预约时间
     */
    public Integer maxReservationTime;
}

package com.fudan.reservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * @autor yud1
 * @date 2023/5/5 21:19
 */
public class CheckIn extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Long id;
    private Long reservationId; // 预约记录ID
    private Date checkinTime; // 签到时间

}

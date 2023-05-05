package com.fudan.reservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @autor yud1
 * @date 2023/5/5 21:16
 */
@Data
public class ReservationRecord {

    @TableId(type = IdType.AUTO)
    private int id;

    private int studentId;

    private int seatId;

    private Date startTime;

    private Date endTime;

    private String status;

}

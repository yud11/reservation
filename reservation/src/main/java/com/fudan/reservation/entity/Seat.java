package com.fudan.reservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @autor yud1
 * @date 2023/5/5 21:13
 */
@Data
public class Seat extends BaseEntity {


    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 自习室教室
     */
    private Long roomId;

    private String seatNumber;

    private String type;

    private boolean hasSocket;

    private Date createdAt;

    private Date updatedAt;

}

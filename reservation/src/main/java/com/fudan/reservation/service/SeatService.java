package com.fudan.reservation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fudan.reservation.entity.Seat;

import java.util.List;

/**
 * @autor yud1
 * @date 2023/5/5 21:42
 */
public interface SeatService extends IService<Seat> {


    List<Seat> queryByRoomId(Long roomId);
}

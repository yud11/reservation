package com.fudan.reservation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fudan.reservation.entity.Seat;
import com.fudan.reservation.mapper.SeatMapper;
import com.fudan.reservation.service.SeatService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor yud1
 * @date 2023/5/5 21:43
 */
@Service
public class SeatServiceImpl extends ServiceImpl<SeatMapper, Seat> implements SeatService {

    @Override
    public List<Seat> queryByRoomId(Long roomId) {
        if (roomId == null){
            return null;
        }
        return list(new LambdaQueryWrapper<Seat>().eq(Seat::getRoomId, roomId));
    }
}

package com.fudan.reservation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fudan.reservation.entity.Room;
import com.fudan.reservation.mapper.RoomMapper;
import com.fudan.reservation.service.RoomService;
import org.springframework.stereotype.Service;

/**
 * @autor yud1
 * @date 2023/5/5 21:25
 */
@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService {
}

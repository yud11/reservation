package com.fudan.reservation.controller;

import com.fudan.reservation.dto.Result;
import com.fudan.reservation.entity.Room;
import com.fudan.reservation.entity.Seat;
import com.fudan.reservation.service.RoomService;
import com.fudan.reservation.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @autor yud1
 * @date 2023/5/5 20:12
 */
@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;


    @Autowired
    private SeatService seatService;

    /**
     * 获取所有的自习室
     */
    @GetMapping("/rooms")
    public Result<List<Room>> getAllRooms(){
        List<Room> rooms = roomService.list();
        return  Result.ofSuccess(rooms);
    }


    /**
     *获取某个自习室的详细信息
     */
    @GetMapping("/room/{id}")
    public Result<Room> getRoomById(@PathVariable Long id){
        Room room = roomService.getById(id);
        return  Result.ofSuccess(room);
    }


    /**
     *获取某个自习室的所有座位信息
     */
    @GetMapping("/room/{id}/seats")
    public Result<List<Seat>> getSeatsByRoomId(@PathVariable Long roomId){
        List<Seat> seats = seatService.queryByRoomId(roomId);
        return  Result.ofSuccess(seats);
    }





}

package com.dh.demo.service;

import com.dh.demo.domain.Room;
import com.dh.demo.repository.RoomRepository;
import com.dh.demo.web.RoomController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Silver on 10/6/2017.
 */
@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRoom(){
        return roomRepository.findAll();
    }
    public void addNewRoom(RoomController.RoomRequestDTO roomDTO){

        Room newRoom = new Room();
        newRoom.setId(roomDTO.getId());
        newRoom.setCode(roomDTO.getCode());
        newRoom.setCapacity(roomDTO.getCapacity());

        roomRepository.save(newRoom);
    }
}

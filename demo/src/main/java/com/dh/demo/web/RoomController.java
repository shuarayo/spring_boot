package com.dh.demo.web;

import com.dh.demo.domain.Room;
import com.dh.demo.repository.RoomRepository;
import com.dh.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Silver on 10/6/2017.
 */
@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Room> getAllRoom(){
        return roomService.getAllRoom();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addRoom(@RequestBody RoomRequestDTO room){
        roomService.addNewRoom(room);
    }
    public static class RoomRequestDTO{
        private String id;
        private String code;
        private int capacity;

        public String getId() {
            return id;
        }

        public String getCode() {
            return code;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }


}

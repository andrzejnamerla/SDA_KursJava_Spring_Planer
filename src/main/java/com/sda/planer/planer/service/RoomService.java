package com.sda.planer.planer.service;

import com.sda.planer.planer.model.Room;
import com.sda.planer.planer.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public void saveRoom(Room room){
        roomRepository.save(room);
    }

    public Room get(Long id){
        return roomRepository.findOne(id);
    }

    public List<Room> getAll() {
        return StreamSupport.stream(roomRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}

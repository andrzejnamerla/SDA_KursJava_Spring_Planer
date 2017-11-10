package com.sda.planer.planer.service;

import com.sda.planer.planer.model.Meeting;
import com.sda.planer.planer.repository.MeetingRepository;
import com.sda.planer.planer.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class MeetingService {

    private MeetingRepository meetingRepository;

    @Autowired
    public MeetingService(MeetingRepository meetingRepository){
        this.meetingRepository = meetingRepository;
    }

    public void saveRoom(Meeting meeting){meetingRepository.save(meeting);
    }

    public Meeting get(Long id){
        return meetingRepository.findOne(id);
    }

    public List<Meeting> getAll() {
        return StreamSupport.stream(meetingRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}

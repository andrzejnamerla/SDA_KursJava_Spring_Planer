package com.sda.planer.planer.controller;

import com.sda.planer.planer.model.Meeting;
import com.sda.planer.planer.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/meetings")
public class MeetingController {

    private MeetingService meetingService;

    @Autowired
    public MeetingController(MeetingService meetingService){
        this.meetingService = meetingService;
    }

    @GetMapping
    public ModelAndView allMeetings(){
        ModelAndView modelAndView = new ModelAndView("allMeetings");
        modelAndView.addObject("meetings", meetingService.getAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getMeeting(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("meeting");
        modelAndView.addObject("meeting",meetingService.get(id));
        return modelAndView;
    }

    @PostMapping
    public String addRoom(@ModelAttribute Meeting meeting){
        meetingService.saveRoom(meeting);
        return "redirect:/meetings";
    }
}

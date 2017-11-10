package com.sda.planer.planer.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @ManyToOne
    private Room room;

    @ManyToMany
    private List<Employee> attendees;

    @ManyToOne
    private Employee owner;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDate date;
}

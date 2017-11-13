package com.sda.planer.planer.model;

import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
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

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Employee> attendees;

    @ManyToOne(fetch = FetchType.LAZY)
    //@OnDelete(action = OnDeleteAction.CASCADE)
    private Employee owner;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public int getAttendeesCount() {
        return (attendees == null ? 0 : attendees.size()) + 1;
    }

    public String getShortenedDescription() {
        return StringUtils.abbreviate(description, 20);
    }
}

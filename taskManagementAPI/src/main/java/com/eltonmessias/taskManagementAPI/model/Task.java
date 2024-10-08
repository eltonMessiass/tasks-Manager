package com.eltonmessias.taskManagementAPI.model;

import com.eltonmessias.taskManagementAPI.model.enums.TASK_STATUS;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private TASK_STATUS status = TASK_STATUS.PENDING;
    private Date created_at;
    private LocalDate dueDate;
    @ManyToOne
    private User assignee;
}

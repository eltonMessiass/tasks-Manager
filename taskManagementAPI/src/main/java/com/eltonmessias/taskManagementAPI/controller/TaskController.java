package com.eltonmessias.taskManagementAPI.controller;

import com.eltonmessias.taskManagementAPI.model.Task;
import com.eltonmessias.taskManagementAPI.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;


    @PostMapping("/create_task")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task newTask = taskService.saveTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<Task> getTask(@PathVariable long id) {
        return new ResponseEntity<>(taskService.getTask(id), HttpStatus.OK);
    }


}

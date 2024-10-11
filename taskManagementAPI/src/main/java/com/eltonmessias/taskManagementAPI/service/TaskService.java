package com.eltonmessias.taskManagementAPI.service;


import com.eltonmessias.taskManagementAPI.model.Task;
import com.eltonmessias.taskManagementAPI.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Task getTask(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> getTasks(){
        return taskRepository.findAll();
    }
}

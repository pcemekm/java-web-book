package pl.przemekm.webBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.przemekm.webBook.entity.Task;
import pl.przemekm.webBook.repository.TaskReposiory;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskReposiory taskReposiory;

    public List<Task> getTasks(){
        return taskReposiory.findAll();
    }
}

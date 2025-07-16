package pl.przemekm.webBook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.przemekm.webBook.entity.Task;
import pl.przemekm.webBook.service.TaskService;

import java.net.http.HttpResponse;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskService taskService;

 @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getTasks(){
     List<Task> answer = taskService.getTasks();

     log.info("LogTest" + answer);
     return ResponseEntity.ok(answer);
 }

 @GetMapping("/types")
    public ResponseEntity<String> getTypes(){
     return ResponseEntity.ok("int,");
 }

 @GetMapping("/annotation")
    public ResponseEntity<String> getAnnotations(){
     return ResponseEntity.ok("@RestController");
 }

 @GetMapping("/tests")
    public ResponseEntity<String> getTests(){
     return ResponseEntity.ok("Jednostkowe, Integracyjne, E2E");
 }

 @GetMapping("/exceptions")
    public ResponseEntity<String> getExceptions(){
     return ResponseEntity.ok("numericException");
 }

 @GetMapping("/threading")
    public ResponseEntity<String> getThreading(){
     return ResponseEntity.ok("Threading");
 }
 }

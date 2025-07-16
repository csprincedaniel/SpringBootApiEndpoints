package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    private List<NoteRequest> todos = new ArrayList<>();
    
    @CrossOrigin(origins = "*")
    @PostMapping("/todos")
    public ResponseEntity<String> addtodo(@RequestBody NoteRequest request){
        todos.add(request);
        return ResponseEntity.ok(request.getTask());
    }
 
    @CrossOrigin(origins="*")
    @GetMapping("/todos")
    public ResponseEntity<List<NoteRequest>>  gettodo(){
        return ResponseEntity.ok(todos);
    }

    @CrossOrigin(origins="*")
    @GetMapping("todos/{id}")
    public ResponseEntity<NoteRequest> getatodo(@PathVariable int id){
        for (NoteRequest todo : todos) {
            if (todo.getId() == id) {
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins="*")
    @PutMapping("todos/{id}")
    public ResponseEntity<NoteRequest> updateatodo(@PathVariable int id, @RequestBody NoteRequest updatedTodo){
        for (NoteRequest todo: todos){
            if (todo.getId() == id){
                todo.setTask(updatedTodo.getTask());
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.notFound().build();
    }

}

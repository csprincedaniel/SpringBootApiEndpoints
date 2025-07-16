package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    private List<NoteRequest> todos = new ArrayList<>();
    
    @PostMapping("/todos")
    public ResponseEntity<String> addtodo(@RequestBody NoteRequest request){
        return ResponseEntity.ok(request.getTask());
    }
}

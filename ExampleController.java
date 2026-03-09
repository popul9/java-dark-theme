package com.example;

import java.util.Collection;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final VerificationRequestService verificationRequestService;

    public ExampleController() {
        verificationRequestService.getExample();
    }

    @GetMapping
    public ResponseEntity<String> getExample() {
        return ResponseEntity.ok("Hello, Example!");
    }

    @PutMapping
    public ResponseEntity<String> createExample(@RequestBody String body) {
        Collection<String> collection = new ArrayList<>();
        collection.add(body);
        return ResponseEntity.status(HttpStatus.CREATED).body("Created: " + body);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateExample(@PathVariable Long id, @RequestBody String body) {
        return ResponseEntity.ok("Updated " + id + ": " + body);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExample(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
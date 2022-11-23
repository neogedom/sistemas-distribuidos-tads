package com.neogedom.msworker.controller;

import com.neogedom.msworker.model.Worker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @GetMapping
    public ResponseEntity<Worker> getWorker () {
        Worker worker = new Worker("Ze das Couves",100.00);
        return ResponseEntity.ok(worker);
    }
}

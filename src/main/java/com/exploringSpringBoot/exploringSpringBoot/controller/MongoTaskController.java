package com.exploringSpringBoot.exploringSpringBoot.controller;

import com.exploringSpringBoot.exploringSpringBoot.entity.MongoTaskEntry;
import com.exploringSpringBoot.exploringSpringBoot.service.MongoTaskEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MongoTaskController {

    @Autowired
    private MongoTaskEntryService mongoTaskEntryService;

    @PostMapping
    public boolean createTaskEntry(@RequestBody MongoTaskEntry mongoTaskEntry) {
        mongoTaskEntryService.saveTaskToDB(mongoTaskEntry);
        return true;
    }

    @GetMapping("/tasks")
    public List<MongoTaskEntry> getTaskEntries(){
        return mongoTaskEntryService.getTaskEntries();
    }
}

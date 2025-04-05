package com.exploringSpringBoot.exploringSpringBoot.controller;

import com.exploringSpringBoot.exploringSpringBoot.entity.TasksEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private Map<Long,TasksEntry> taskEntries = new HashMap();

    @GetMapping
    public List<TasksEntry> getTaskEntries() {
        return new ArrayList(taskEntries.values());
    }
    @PostMapping
    public TasksEntry createTaskEntry(@RequestBody TasksEntry entry) {
        taskEntries.put(entry.getId(),entry);
        return entry;
    }
    @GetMapping("/task")
    public TasksEntry getTaskEntryById(@RequestParam Long id) {
        System.out.println("ID: " + id);
        return taskEntries.get(id);
    }
    @PatchMapping("/task")
    public TasksEntry updateTaskEntry(@RequestParam Long id, @RequestBody TasksEntry entry) {
       return taskEntries.put(id,entry);
    }
    @DeleteMapping("/task")
    public boolean deleteTaskEntryById(@RequestParam Long id) {
        taskEntries.remove(id);
        return true;
    }

}

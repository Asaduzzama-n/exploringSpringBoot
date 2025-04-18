package com.exploringSpringBoot.exploringSpringBoot.service;

import com.exploringSpringBoot.exploringSpringBoot.entity.MongoTaskEntry;
import com.exploringSpringBoot.exploringSpringBoot.repository.TaskEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoTaskEntryService {

    @Autowired
    private TaskEntryRepository mongoTaskRepository;

//    public MongoTaskEntryService(TaskEntryRepository mongoTaskRepository) {
//        this.mongoTaskRepository = mongoTaskRepository;
//    }

    public void  saveTaskToDB(MongoTaskEntry mongoTaskEntry) {
        mongoTaskRepository.save(mongoTaskEntry);
    }

    public List<MongoTaskEntry> getTaskEntries() {
        return mongoTaskRepository.findAll();
    }
}

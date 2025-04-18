package com.exploringSpringBoot.exploringSpringBoot.repository;

import com.exploringSpringBoot.exploringSpringBoot.entity.MongoTaskEntry;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface TaskEntryRepository extends MongoRepository<MongoTaskEntry, String> {
    // This interface will automatically provide CRUD operations for TaskEntry
    // You can add custom query methods here if needed
    // For example: List<TaskEntry> findByStatus(String status);
}

package com.borsa.todo.repository;

import com.borsa.todo.model.toDo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
 * @created 23 February, 2021
 * @author Halil Gatgar
 * @project toDoList
 */
@Repository
public interface toDoMongoRepository extends MongoRepository<toDo, String> {
}
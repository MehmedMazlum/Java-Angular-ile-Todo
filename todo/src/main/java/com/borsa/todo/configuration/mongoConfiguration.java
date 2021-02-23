package com.borsa.todo.configuration;

import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
/*
 * @created 23 February, 2021
 * @author Halil Gatgar
 * @project toDoList
 */
@EnableMongoRepositories(basePackages = {"com.borsa.todo.repository"})
public class mongoConfiguration extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "toDoListdb";
    }
}
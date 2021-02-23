package com.borsa.todo.service;

import com.borsa.todo.model.toDo;

import java.util.List;
/*
 * @created 23 February, 2021
 * @author Halil Gatgar
 * @project toDoList
 */

public interface toDoInterface {
    toDo get(String id);
    List<toDo> list();
    void save(String description, int date);
    void update(String id, String description, int date);
    void delete(String id);
}

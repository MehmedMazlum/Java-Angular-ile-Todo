package com.borsa.todo.service;

import com.borsa.todo.model.toDo;

import java.util.List;

public interface toDoInterface {
    toDo get();
    List<toDo> list();
    void save(String id);
    void update(String id);
    void delete(String id);
}

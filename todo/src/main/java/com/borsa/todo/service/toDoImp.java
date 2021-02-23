package com.borsa.todo.service;

import com.borsa.todo.model.toDo;
import lombok.AllArgsConstructor;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@AllArgsConstructor
public class toDoImp implements  toDoInterface {

    @Autowired
    private toDoInterface toDoInterface;


    @Override
    public toDo get() {
        return toDoInterface.get();
    }

    @Override
    public List<toDo> list() {
        return toDoInterface.list();
    }

    @Override
    public void save(String id) {
        toDoInterface.save(id);

    }

    @Override
    public void update(String id) {
        toDoInterface.update(id);
    }

    @Override
    public void delete(String id) {
        toDoInterface.delete(id);
    }
}

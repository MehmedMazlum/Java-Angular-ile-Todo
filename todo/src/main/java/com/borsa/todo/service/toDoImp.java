package com.borsa.todo.service;

import com.borsa.todo.model.toDo;
import com.borsa.todo.repository.toDoMongoRepository;
import lombok.AllArgsConstructor;
import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/*
 * @created 23 February, 2021
 * @author Halil Gatgar
 * @project toDoList
 */

@Service
@AllArgsConstructor
public class toDoImp implements  toDoInterface {

    private static Logger LOG = LoggerFactory.getLogger(toDoImp.class);

    @Autowired
    private toDoMongoRepository toDoMongoRepository;

    @Override
    public toDo get(String id) {
        Optional<toDo> byId = toDoMongoRepository.findById(String.valueOf(id));
        if(byId.isPresent()){
            toDo toDo = byId.get();

            return  toDo;
        }
        else
            LOG.info("id =" + id + " get = null");
        return null;
    }

    @Override
    public List<toDo> list() {
        return toDoMongoRepository.findAll();
    }

    @Override
    public void save(String description, int date) {
        toDo newToDo = new toDo();
        newToDo.setDate(date);
        newToDo.setDescription(description);
        toDoMongoRepository.save(newToDo);
    }

    @Override
    public void update(int id, String description, int date) {
        Optional<toDo> byId = toDoMongoRepository.findById(String.valueOf(id));
        if(byId.isPresent()){
            toDo toDo = byId.get();
            toDo.setDescription(description);
            toDo.setDate(date);
            toDoMongoRepository.save(toDo);
        }
        else
            LOG.info("id =" + id + " get = null");
    }

    @Override
    public void delete(int id) {
        toDoMongoRepository.deleteById(String.valueOf(id));
    }
}

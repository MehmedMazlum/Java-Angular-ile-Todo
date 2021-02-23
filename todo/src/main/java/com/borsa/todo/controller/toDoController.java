package com.borsa.todo.controller;

import com.borsa.todo.model.toDo;
import com.borsa.todo.service.toDoInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/*
 * @created 23 February, 2021
 * @author Halil Gatgar
 * @project toDoList
 */

@RestController
@RequestMapping("toDo")
public class toDoController {

        @Autowired
        toDoInterface toDoInterface;

    private static Logger LOG = LoggerFactory.getLogger(toDoController.class);

        //TODO:Kayit islemi oldugunda bu metoda dusmesi bekleniyor
        @GetMapping(path = "/toDo/save/{description}/{date}")
        public void savedToDo(@RequestBody String description,@RequestBody int date) {
            LOG.info("starting process for save, date:" + date + ", description=" +description);
            toDoInterface.save(description, date);
        }

        //TODO:Guncelleme islemi oldugunda bu metoda dusmesi bekleniyor
        @GetMapping(path = "/toDo/update/{id}/{description}/{date}")
        public void updateToDo(@RequestBody int id,@RequestBody String description, @RequestBody int date) {
            LOG.info("starting process for update, date:" + date + ", description=" +description);
            toDoInterface.update(id,description,date);
        }

    //TODO:Silme islemi oldugunda bu metoda dusmesi bekleniyor
    @GetMapping(path = "/toDo/delete/{id}")
    public void deleteToDo(@RequestBody int id) {
        LOG.info("starting process for delete, id:" + id);
        toDoInterface.delete(id);
    }

    //TODO:Listeleme islemi oldugunda bu metoda dusmesi bekleniyor
    @GetMapping(path = "/toDo/list")
    public List<toDo> listToDo() {
        LOG.info("starting process for list");
        List<toDo> list = toDoInterface.list();
        return list;
    }

    //TODO:Get islemi oldugunda bu metoda dusmesi bekleniyor
    @GetMapping(path = "/toDo/get/{id}")
    public toDo getToDo(@RequestBody int id) {
        LOG.info("starting process for get, id:" + id);
        toDo toDo = toDoInterface.get(String.valueOf(id));
        return toDo;
    }

}

package com.borsa.todo.controller;

import com.borsa.todo.model.toDo;
import com.borsa.todo.service.toDoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("toDo")
// @Api(value = "assessment api")
public class toDoController {

        @Autowired
        toDoInterface toDoInterface;

        //TODO:Mail ile adaya gelen link aktifleştiği zaman ilk olarak bu metoda düşmesi bekleniyor
        //@ApiOperation(value = "New User for Activation")
        @GetMapping(path = "/toDo/save/{id}")
        public void savedToDo(@RequestBody String id) {
            toDoInterface.save(id);
        }

        //TODO:Mail ile adaya gelen link aktifleştiği zaman ilk olarak bu metoda düşmesi bekleniyor
        //@ApiOperation(value = "New User for Activation")
        @GetMapping(path = "/toDo/update/{id}")
        public void updateToDo(@RequestBody String id) {
            toDoInterface.update(id);
        }

    //TODO:Mail ile adaya gelen link aktifleştiği zaman ilk olarak bu metoda düşmesi bekleniyor
    //@ApiOperation(value = "New User for Activation")
    @GetMapping(path = "/toDo/delete/{id}")
    public void deleteToDo(@RequestBody String id) {
        toDoInterface.delete(id);
    }

    //TODO:Mail ile adaya gelen link aktifleştiği zaman ilk olarak bu metoda düşmesi bekleniyor
    //@ApiOperation(value = "New User for Activation")
    @GetMapping(path = "/toDo/list")
    public void listToDo() {
        toDoInterface.list();
    }

    //TODO:Mail ile adaya gelen link aktifleştiği zaman ilk olarak bu metoda düşmesi bekleniyor
    //@ApiOperation(value = "New User for Activation")
    @GetMapping(path = "/toDo/get")
    public void getToDo() {
        toDoInterface.get();
    }

}

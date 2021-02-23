package com.borsa.todo;

import com.borsa.todo.model.toDo;
import org.junit.Assert;
import org.junit.Test;

public class ToDoApplicationTest {

    @Test
    public void ToDoApplicationTestDescription(){
        System.out.println("Start ToDoApplicationTestDescription()... ");
         toDo toDo = new toDo();
        toDo.setDescription("sad");
        System.out.println("hepsi: " + toDo.getDescription());

    }

}

package com.borsa.todo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

/*
 * @created 23 February, 2021
 * @author Halil Gatgar
 * @project toDoList
 */
@Data
public class toDo {

    @Getter @Setter String description;
    @Getter @Setter int date;
    @Id
    @Getter @Setter int id;

}

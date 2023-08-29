package com.multicampus.springex.service;

import com.multicampus.springex.dto.PageRequestDTO;
import com.multicampus.springex.dto.PageResponseDTO;
import com.multicampus.springex.dto.TodoDTO;
import com.sun.tools.javac.comp.Todo;

import java.util.List;

public interface TodoService {
    void register(TodoDTO todoDTO);

    //    List<TodoDTO> getAll();

    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    List<TodoDTO> getAll();

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);


}

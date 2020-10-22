package com.sangsang.mybatisplusds.controller;

import com.sangsang.mybatisplusds.mapper.TestMapper;
import com.sangsang.mybatisplusds.service.BookeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestMapper testMapper;
    @Autowired
    private BookeService bookeService;

    @GetMapping("/book")
    public Object getBook(){
        int newBook = bookeService.getNewBook();
        int oldBook = bookeService.getOldBook();
        return newBook + "-------" +oldBook ;
    }
}

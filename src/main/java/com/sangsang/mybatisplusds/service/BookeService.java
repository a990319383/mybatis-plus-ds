package com.sangsang.mybatisplusds.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.sangsang.mybatisplusds.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookeService {
    @Autowired
    private TestMapper testMapper;
    @DS("master")
   public int getNewBook(){
        return testMapper.getNewCount();
    }
    @DS("slave")
    public int getOldBook(){
        return testMapper.getOldCount();
    }
}

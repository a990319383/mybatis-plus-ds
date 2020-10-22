package com.sangsang.mybatisplusds.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sangsang.mybatisplusds.entity.Book;
@DS("slave")
public interface TestMapper extends BaseMapper<Book>{
    @DS("master")
    int getNewCount();
    @DS("slave")
    int getOldCount();
}

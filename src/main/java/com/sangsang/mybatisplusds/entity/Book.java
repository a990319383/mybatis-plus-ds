package com.sangsang.mybatisplusds.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("book")
public class Book {
    @TableId("id")
    private Long id;
    @TableField("cid")
    private int cid;
    @TableField("sid")
    private int sid;
}

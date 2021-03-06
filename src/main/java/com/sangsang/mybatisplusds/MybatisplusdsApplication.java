package com.sangsang.mybatisplusds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class}) //去掉springboot 默认的数据源配置
@MapperScan("com.sangsang.mybatisplusds.mapper")
public class MybatisplusdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplusdsApplication.class, args);
	}

}

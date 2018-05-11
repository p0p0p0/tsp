package cn.spacewalker.tsp.bg.etl.launch;

import cn.spacewalker.tsp.bg.etl.service.IEtlService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

/**
 * This file is part of tsp Project
 * Created by bzzz (bzzz@space-walker.cn) on 2017/8/14 11:14
 * Copyright (c) 2017 www.space-walker.cn
 *
 */

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ImportResource("classpath:spring/etl-spring-quartz.xml")
public class EtlLauncher implements CommandLineRunner {

    @Resource
    private IEtlService etlService;

    public static void main(String[] args) {
        SpringApplication.run(EtlLauncher.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        etlService.etlTask();
//        long l1 = System.currentTimeMillis();
//        etlService.etlVehinfo();
//        long l2 = System.currentTimeMillis();
//        System.err.println(String.format("+++++++++++++++++++++++etlVehinfo cost [%s]ms", l2 - l1));
//
//        long l3 = System.currentTimeMillis();
//        etlService.etlVehsum();
//        long l4 = System.currentTimeMillis();
//        System.err.println(String.format("***********************etlVehsum cost [%s]ms", l4 - l3));

    }
}
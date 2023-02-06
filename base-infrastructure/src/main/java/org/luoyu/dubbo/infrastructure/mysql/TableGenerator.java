package org.luoyu.dubbo.infrastructure.mysql;

import org.luoyu.dubbo.mybatisplus.generator.MybatisGenerator;

public class TableGenerator {

    public static void main(String[] args) {
        MybatisGenerator.mapperXmlDir = "/base-infrastructure/src/main/resources/mapper/";
        MybatisGenerator.outPutDir = "/base-infrastructure/src/main/java";
        MybatisGenerator.parentModel= "org.luoyu.dubbo.infrastructure.mysql";
        MybatisGenerator.username = "root";
        MybatisGenerator.password = "root";
        MybatisGenerator.url = "jdbc:mysql://192.168.106.13:3306/basedata_db?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowMultiQueries=true";
        MybatisGenerator.execMain(args);
    }
}

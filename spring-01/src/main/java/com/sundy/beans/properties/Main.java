package com.sundy.beans.properties;

import com.mchange.v2.c3p0.DataSources;
import com.sundy.beans.autowrite.Address;
import com.sundy.beans.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * 部分属性通过类型和名称配置bean
 */
public class Main {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}

package com.example.config;

import com.example.model.Foo;
import com.example.service.FooService;
import com.example.service.TransactionalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 16/10/8.
 */
public class Boot {
    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        FooService fooService = (FooService) ctx.getBean("fooService");
        fooService.insertFoo (new Foo());

        TransactionalService transactionalService = (TransactionalService) ctx.getBean("transactionalService");
        transactionalService.setSomething();
    }
}

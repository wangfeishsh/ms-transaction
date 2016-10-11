package com.example.service;

import com.example.exception.NoProductInStockException;
import com.example.model.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * Created by user on 16/10/8.
 */
public class DefaultFooService implements FooService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    @Transactional(value = "txManager",rollbackFor = {Throwable.class})
    public void insertFoo(Foo foo) {
        String sql = "insert into foo (name) values ('bao')";
        jdbcTemplate.execute(sql);
        try {
            updateFoo(new Foo());
        }catch (Exception e){
            System.out.println("exception");
        }

    }

//    @Transactional
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    public void resolvePosition() {
//        try {
            // some business logic...
//        } catch (NoProductInStockException ex) {
            // trigger rollback programmatically
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//        }
    }

}

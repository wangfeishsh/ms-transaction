package com.example.service;

import com.example.annotation.AccountTx;
import com.example.annotation.OrderTx;
import com.example.model.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by user on 16/10/9.
 */
@Service
public class TransactionalService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @OrderTx
    public void setSomething() {
        System.out.println("1");
        String sql = "insert into foo (name) values ('bao')";
        jdbcTemplate.execute(sql);
            doSomething();
    }

    @AccountTx
    public void doSomething() {
        System.out.println("2");
//        throw new UnsupportedOperationException();
    }
}

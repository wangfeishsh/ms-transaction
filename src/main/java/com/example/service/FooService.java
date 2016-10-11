package com.example.service;

import com.example.model.Foo;

/**
 * Created by user on 16/10/8.
 */
public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

}

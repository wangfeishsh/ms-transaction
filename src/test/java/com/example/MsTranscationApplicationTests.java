package com.example;

import com.example.model.Foo;
import com.example.service.FooService;
import com.example.service.TransactionalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MsTranscationApplicationTests {

	@Autowired
	private FooService fooService;

	@Autowired
	private TransactionalService transactionalService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFoo() {
		fooService.insertFoo(new Foo());
	}

	@Test
	public void testTrans() {
		transactionalService.setSomething();
	}
}

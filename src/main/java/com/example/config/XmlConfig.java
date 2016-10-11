package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by user on 16/10/6.
 */
@Configuration
@ImportResource(value="classpath:application-context.xml")
@EnableTransactionManagement
public class XmlConfig {
}

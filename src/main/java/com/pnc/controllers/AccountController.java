package com.pnc.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account/v1")
public class AccountController {
    Logger log = LoggerFactory.getLogger(AccountController.class);

    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.url}")
    String db;

    @GetMapping("acc")
    public String getAccountNumber(){
        log.info(userName);
        log.info(db);
        return db;
    }

    @GetMapping("user")
    public String getUserName(){
        log.info(userName);
        log.info(db);
        return userName;
    }
}

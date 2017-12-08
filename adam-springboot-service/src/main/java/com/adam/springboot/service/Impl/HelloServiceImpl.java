package com.adam.springboot.service.Impl;

import com.adam.springboot.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Think on 2017/12/5.
 */
@Repository
@Transactional
public class HelloServiceImpl implements HelloService {
    private static Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    public void helloWorld() {
        logger.info("hello world");
    }
}

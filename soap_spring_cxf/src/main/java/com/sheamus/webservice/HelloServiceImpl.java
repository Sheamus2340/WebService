package com.sheamus.webservice;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by Sheamus on 2016/1/29.
 */
@WebService
@Component
public class HelloServiceImpl implements HelloService {

    public String say(String name) {
        return "Hello " + name;
    }

}

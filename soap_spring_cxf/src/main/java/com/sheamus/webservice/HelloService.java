package com.sheamus.webservice;

import javax.jws.WebService;

/**
 * Created by Sheamus on 2016/1/29.
 */
@WebService
public interface HelloService {

    String say(String name);

}

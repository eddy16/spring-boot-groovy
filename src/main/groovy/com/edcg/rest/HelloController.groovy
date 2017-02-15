package com.edcg.rest

import org.omg.CORBA.Request
import org.springframework.context.annotation.Scope
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Edgar on 15/02/2017.
 */

@RestController
@RequestMapping(value = "/hello")
@Scope("request")
class HelloController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    def hello(@PathVariable def name){
        return "Hello "+name
    }

}

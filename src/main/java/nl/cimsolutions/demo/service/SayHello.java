/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.demo.service;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author k.ali
 */
@RestController
@RequestMapping("/demo")
public class SayHello {

    @GetMapping(value = "/say/{name}")
    public String getName(@PathVariable("name") String name, HttpServletRequest request) {
        return "Hi " + name;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.book;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Michael
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BookApplicationRTTests {

    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void test1() {
      String s=  restTemplate.getForObject("http://localhost:8000/michael", String.class);
        System.out.println(s);
        assertNotNull(s);
    }

}

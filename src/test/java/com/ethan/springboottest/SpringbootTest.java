package com.ethan.springboottest;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/27 16:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes ={SpringboottestApplication.class} )
public class SpringbootTest {

    @Test
   public void testOne(){
      System.out.println("testOne----->>");
      TestCase.assertEquals(1,1);
    }
    @Test
    public void testTwo(){
        System.out.println("testTwo----->>");
        TestCase.assertEquals(1,1);
    }
}

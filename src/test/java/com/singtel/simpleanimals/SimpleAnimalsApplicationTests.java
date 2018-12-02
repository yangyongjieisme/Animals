package com.singtel.simpleanimals;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.singtel.simpleanimals.SimpleAnimalsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleAnimalsApplicationTests {
    @Test
    public void contextLoads() {}
    @Test
    public void applicationStarts() {
    	SimpleAnimalsApplication.main(new String[] {});
    }
}

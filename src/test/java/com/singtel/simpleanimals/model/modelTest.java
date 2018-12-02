package com.singtel.simpleanimals.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class modelTest {

	@Test
	public void q1Test() {

		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
	
	@Test
	public void q2Test() {

		Duck duck = new Duck();
		duck.walk();
		duck.fly();
		duck.sing();
		duck.swim();
		duck.say();
		
		Chicken chicken=new Chicken();
		chicken.say();
		
	}
}

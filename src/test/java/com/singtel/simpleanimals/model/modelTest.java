package com.singtel.simpleanimals.model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
public class modelTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
/*
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
*/	
	@Test
	public void q3Test() {

		
		Chicken rooster=new Chicken();
		rooster.say("Cock-a-doodle-doo");
		assertEquals("Cock-a-doodle-doo", outContent.toString());
	}
}

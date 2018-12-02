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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
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

	@Test
	public void qA1Test() {

		Bird bird = new Bird();
		bird.sing();
		assertEquals("Bird Singing", outContent.toString());
	}
	@Test
	public void q2Test_1() {

		Duck duck = new Duck();
		assertTrue(duck.canFly());
		duck.say("Quack, quack");
		assertEquals("Quack, quack", outContent.toString());
		
		
	}
	@Test
	public void q2Test_2() {

	
		Chicken chicken=new Chicken();
		assertFalse(chicken.canFly());
		chicken.say("Cluck, cluck");
		assertEquals("Cluck, cluck", outContent.toString());
		
	}
	@Test
	public void q3Test() {

	
		Chicken rooster=new Chicken();
		assertFalse(rooster.canFly());
		rooster.say("Cock-a-doodle-doo");
		assertEquals("Cock-a-doodle-doo", outContent.toString());
		
	}
}

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
		duck.sing();
		assertEquals("Quack, quack", outContent.toString());

	}

	@Test
	public void q2Test_2() {

		Chicken chicken = new Chicken();
		chicken.sing();
		assertEquals("Cluck, cluck", outContent.toString());

	}

	@Test
	public void q3Test() {

		Chicken rooster = new Chicken(true);
		rooster.sing();
		assertEquals("Cock-a-doodle-doo", outContent.toString());

	}

	@Test
	public void q4Test() {

		Parrot withRooster = new Parrot(new Chicken(true));
		withRooster.sing();
		assertEquals("Cock-a-doodle-doo", outContent.toString());
	}

	@Test
	public void qB1Test() {

		Fish fish = new Fish();
		fish.swim();
		assertEquals("I am swiming", outContent.toString());
	}

	@Test
	public void qB2Test() {

		Shark shark = new Shark();
		assertEquals("large", shark.getSize());
		Clownfish clownfish = new Clownfish();
		assertEquals("small", clownfish.getSize());
	}
	
	@Test
	public void qB3Test() {

		Dolphin dolphin=new Dolphin();
		try {
			dolphin.swim();
		}catch(Exception e) {
			System.out.println(e);
		}
		assertEquals("I am swiming", outContent.toString());
	}
}

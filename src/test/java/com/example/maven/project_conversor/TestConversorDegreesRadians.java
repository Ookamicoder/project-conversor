package com.example.maven.project_conversor;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;


public class TestConversorDegreesRadians {
	ConversorDegreesRadians cdr = new ConversorDegreesRadians();
	public static final Logger LOG = Logger.getLogger(ConversorDegreesRadians.class.getName());
	Random random = new Random();

	@Test
	public void testDegreesToRadian() {
		for(int i = 0;i < 10;i++) {
			double numberToTest = random.nextDouble()*100;
			double result = numberToTest*Math.PI/180;
			LOG.info("Testing the method radiansToDegrees with: "+numberToTest);
			assertEquals(cdr.degreesToRadian(numberToTest), result,1);		
		}
	}
	
	@Test
	public void testRadiansToDegrees() {
		for(int i = 0;i < 10;i++) {
			double numberToTest = random.nextDouble()*100;
			double result = numberToTest*180/Math.PI;
			LOG.info("Testing the method radiansToDegrees with: "+numberToTest);
			assertEquals(cdr.radiansToDegrees(numberToTest), result,1);		
		}

	}

}

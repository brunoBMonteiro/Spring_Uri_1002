package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CirculoTest {
	@Test
	public void test2() {
		Circulo c1 = new Circulo(2.00);
		double expected = 12.5664;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void test100Dot64() {
		Circulo c1 = new Circulo(100.64);
		double expected = 31819.3103;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void test150() {
		Circulo c1 = new Circulo(150.00);
		double expected = 70685.7750;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void test5Dot2() {
		Circulo c1 = new Circulo(5.2);
		double expected = 84.949;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.001);
	}	
	
	@Test
	public void test15Dot2() {
		Circulo c1 = new Circulo(15.2);
		double expected = 725.833;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.001);
	}
}
